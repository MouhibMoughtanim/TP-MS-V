package org.ensaj.voiture;

import jakarta.transaction.Transactional;
import org.ensaj.voiture.Model.Voiture;
import org.ensaj.voiture.Proxy.ClientProxy;
import org.ensaj.voiture.Repository.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.cloud.openfeign.FeignClient;

@EnableFeignClients
@SpringBootApplication
public class VoitureApplication {

    @Autowired
    private ClientProxy clientService;
    public static void main(String[] args) {
        SpringApplication.run(VoitureApplication.class, args);
    }

    @Transactional
    @Bean
    CommandLineRunner initialiserBaseMySQL(VoitureRepository voitureRepository, ClientProxy clientService){
        return args -> {
            Client c1 = clientService.findClientByID(2L);
            Client c2 = clientService.findClientByID(1L);

            Voiture v1 = new Voiture(Long.parseLong("1"), "Mercedes Benz", "A", "M1", c2.getId());
            Voiture v2 = new Voiture(Long.parseLong("2"), "Bentley", "B", "M2", c1.getId());
            Voiture v3 = new Voiture(Long.parseLong("3"), "Audi", "C", "M3", c2.getId());

            voitureRepository.save(v1);
            voitureRepository.save(v2);
            voitureRepository.save(v3);


        };
    }

}

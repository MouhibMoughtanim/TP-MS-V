package org.ensaj.voiture.Proxy;


import java.util.List;

import org.ensaj.voiture.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@FeignClient(name = "CLIENT-SERVICE")//
public interface ClientProxy{

    @GetMapping("/clients/{id}")
    Client findClientByID(@PathVariable Long id);

    @GetMapping("/clients")
    List<Client> allClient();


}
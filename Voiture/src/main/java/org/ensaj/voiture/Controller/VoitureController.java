package org.ensaj.voiture.Controller;

import org.ensaj.voiture.Client;
import org.ensaj.voiture.Model.Voiture;
import org.ensaj.voiture.Proxy.ClientProxy;
import org.ensaj.voiture.Repository.VoitureRepository;
import org.ensaj.voiture.Service.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class VoitureController {
    @Autowired
    VoitureRepository voitureRepository;

    @Autowired
    ClientProxy clientRest;
    @Autowired
    VoitureService voitureService;

    @GetMapping(value ="/voitures", produces = {"application/json"})
    public ResponseEntity<List<Voiture>> chercherVoiture(){
        return ResponseEntity.ok(voitureRepository.findAll());
    }

    @GetMapping("/voitures/{id}")
    public Voiture chercherUneVoiture(@PathVariable Long id) throws Exception{
        Voiture voiture = voitureRepository.findById(id).get();
        Client client = clientRest.findClientByID(voiture.getClientId());
        voiture.setClient(client);
        return voiture;
    }
    @PostMapping("/voitures")
    public Voiture enregistrerUneVoiture(@RequestBody Voiture voiture){
        return voitureService.enregistrerVoiture(voiture);
    }
}

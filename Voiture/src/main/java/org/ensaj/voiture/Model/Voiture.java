package org.ensaj.voiture.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ensaj.voiture.Client;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Voiture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String matricule;
    private String marque;
    private String model;
    @Transient
    private Client client;
    private Long clientId;


    public Voiture(Long id,String matricule, String marque, String model, Long clientId) {
        super();
        this.id = id;
        this.matricule=matricule;
        this.marque = marque;
        this.model = model;
        this.clientId = clientId;

    }


}

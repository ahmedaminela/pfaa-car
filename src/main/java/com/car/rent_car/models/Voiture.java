package com.car.rent_car.models;

import lombok.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data

public class Voiture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modele;
    private String matricule;
    private String couleur;
    private Boolean dispo;
    private String carburant;
    private Double km;
    private Date date_sortie;
    private int puissance;

    @OneToMany(mappedBy = "voiture")
    private List<Reservation> reservations;
    @ManyToOne
    @JoinColumn(name = "marque_id")
    private Marque marque;
    @OneToOne(mappedBy = "voiture")
    private Assurance assurance;
    @OneToMany(mappedBy = "voiture", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PrixVoiture> prixList;


    // Other fields, getters, setters, and constructors

}


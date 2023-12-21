package com.car.rent_car.requests;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class VoitureRequest {

    private String modele;
    private String matricule;
    private String couleur;
    private Boolean dispo;
    private String carburant;
    private Double km;
    @JsonFormat(pattern="yyyy-MM-dd", timezone="GMT+1")
    private Date date_sortie;
    private int puissance;
    private int marque_id;
}

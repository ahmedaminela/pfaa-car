package com.car.rent_car.services;

import com.car.rent_car.models.Voiture;
import com.car.rent_car.repository.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class VoitureService implements IVoitureService {

   @Autowired
    private VoitureRepository voitureRepository;

    public List<Voiture> getAllVoitures() {
        return voitureRepository.findAll();
    }

    public Voiture getVoitureById(Long id) {
        return voitureRepository.findById(id).orElse(null);
    }

    @Transactional
    public Voiture saveVoiture(Voiture voiture) {
        return voitureRepository.save(voiture);
    }

    @Transactional
    public void deleteVoiture(Long id) {
        voitureRepository.deleteById(id);
    }


}

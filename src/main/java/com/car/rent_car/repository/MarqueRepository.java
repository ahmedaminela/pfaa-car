package com.car.rent_car.repository;

import com.car.rent_car.models.Marque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarqueRepository extends JpaRepository<Marque, Long> {
    // Additional custom query methods can be defined here
}

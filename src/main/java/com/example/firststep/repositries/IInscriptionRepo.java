package com.example.firststep.repositries;


import com.example.firststep.entites.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IInscriptionRepo extends JpaRepository<Inscription,Long> {
}

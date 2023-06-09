package com.example.firststep.repositries;

import com.example.firststep.entites.Piste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPisteRepo extends JpaRepository<Piste,Long> {
}

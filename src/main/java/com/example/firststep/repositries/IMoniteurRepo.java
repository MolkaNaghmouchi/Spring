package com.example.firststep.repositries;

import com.example.firststep.entites.Cours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMoniteurRepo extends JpaRepository<Cours,Long> {
}

package com.example.firststep.repositries;

import com.example.firststep.entites.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ICoursRepo extends JpaRepository<Cours,Long> {
    //List<Integer> findnumSemaineByMoniteurAndnum_cour(String moniteur, String num_cour);



}

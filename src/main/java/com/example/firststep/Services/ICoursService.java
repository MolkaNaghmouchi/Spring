package com.example.firststep.Services;

import com.example.firststep.entites.Cours;
import com.example.firststep.entites.Skieur;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ICoursService  {
    public Cours addCour(Cours cours);
    public List<Cours> getAll();
    public  Cours getCoursbyId(Long id);
    public Cours updateCours(Long id  );
    public void deleteCour(Long id);

    Cours retriveCours(Long numCours);
}

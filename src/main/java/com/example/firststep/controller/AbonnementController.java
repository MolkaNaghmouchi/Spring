package com.example.firststep.controller;

import com.example.firststep.Services.IAbonnemetService;
import com.example.firststep.entites.Abonnement;
import com.example.firststep.enu.TypeAbonnement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/abonnement")

public class AbonnementController {


    @Autowired
    public IAbonnemetService abonnemetService;

    @GetMapping("/type/{type}")
    List<Abonnement> getAbonnementsByTypeOrderedByDate(TypeAbonnement typeAbonnement) {
        return abonnemetService.findByTypeAbonnementOrderByDateDebut(typeAbonnement);
    }

  /*  @GetMapping("/type/{type}")
    public List<Abonnement> getAbonnementsByType(@PathVariable TypeAbonnement typeAbonnement) {
        return abonnemetService.getListByTypeAbonnement(typeAbonnement);
    }*/




    @GetMapping("/dates")
    public List<Abonnement> getListByAbonnementByDates(LocalDate dateDebut, LocalDate dateFin) {
return abonnemetService.getListByAbonnementByDates(dateDebut , dateFin);
    }


}


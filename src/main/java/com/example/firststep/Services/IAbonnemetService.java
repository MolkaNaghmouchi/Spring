package com.example.firststep.Services;

import com.example.firststep.entites.Abonnement;
import com.example.firststep.enu.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;


public interface IAbonnemetService {
    public  List<Abonnement> getListByTypeAbonnement(TypeAbonnement typeAbonnement);
    public  List<Abonnement> getListByAbonnementByDates(LocalDate dateDebut, LocalDate dateFin);

    public  List<Abonnement> findByTypeAbonnementOrderByDateDebut(TypeAbonnement typeAbonnement);

    // List<Abonnement> getAbonnementsByType(TypeAbonnement type);
}

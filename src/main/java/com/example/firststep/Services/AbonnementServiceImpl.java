package com.example.firststep.Services;
import com.example.firststep.entites.Abonnement;
import com.example.firststep.enu.TypeAbonnement;
import com.example.firststep.repositries.IAbonnementRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
@Service
public class AbonnementServiceImpl implements IAbonnemetService{


    @Autowired
    IAbonnementRepo abonnementRepo ;
    @Override
    public List<Abonnement> getListByTypeAbonnement(TypeAbonnement typeAbonnement) {
        return abonnementRepo.findByTypeAbonnement(typeAbonnement);
    }

    @Override
    public List<Abonnement> getListByAbonnementByDates(LocalDate dateDebut, LocalDate dateFin) {
        return abonnementRepo.getAbonnementByDateDebutBetween(dateDebut , dateFin);
    }

    @Override
    public List<Abonnement> findByTypeAbonnementOrderByDateDebut(TypeAbonnement typeAbonnement) {
        return abonnementRepo.findByTypeAbonnement(typeAbonnement);
    }



}

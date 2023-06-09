package com.example.firststep.repositries;

import com.example.firststep.entites.Skieur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
@Repository
public interface ISkieurRepo extends JpaRepository<Skieur,Long> {
    //by : heya lwhere
    //bch testha9, haaja f lb.d defenha f repository
    public  Skieur findByNomSAndPrenomS(String nom , String prenom);

    public List<Skieur> findByDateNaissanceGreaterThan(Date dateNaissance);
    public  Skieur findByNomSAndPrenomSAndDateNaissance(String nom , String Prenom ,Date dateNaissance  );
  //  @Query("select a from  a where a.nomS=:x and a.PrenomS=:y ")

@Query("select s from Skieur s where s.nomS =:nom and s.prenomS =:prenom " )
public  Skieur getSkieurByNomSAndAndPrenomS(@Param("nom") String nom , @Param("prenom") String prenom);
}

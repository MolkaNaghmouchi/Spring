package com.example.firststep.entites;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Skieur {
    @Id
    private Long numSkieur;

   private String nomS;
   private  String prenomS;
   private LocalDate dateNaissance;
   private String ville;
@ManyToMany(mappedBy = "skieurList")
    private List<Piste> pisteList;
@OneToMany(mappedBy = "skieur")
    private  List<Inscription> inscrit;
}

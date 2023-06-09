package com.example.firststep.entites;

import lombok.*;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.io.Serializable;
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
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long numSkieur;

   private String nomS;
   private  String prenomS;
   private LocalDate dateNaissance;
   private String ville;
@ManyToMany
    private List<Piste> pisteList;
@OneToMany(mappedBy = "skieur")
    private  List<Inscription> inscrit;

@OneToOne(cascade=CascadeType.PERSIST)
    private Abonnement abonnement;
}

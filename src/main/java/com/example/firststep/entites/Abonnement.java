package com.example.firststep.entites;


import com.example.firststep.enu.TypeAbonnement;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Abonnement implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numAbon;
    private LocalDate dateDebut ;
    private LocalDate dateFin;
    private   Float  prixAbon;
    @Enumerated
    private TypeAbonnement typeAbonnement;
    @OneToOne
    private  Skieur  Skieur;


}

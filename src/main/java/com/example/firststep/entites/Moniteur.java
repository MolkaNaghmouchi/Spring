package com.example.firststep.entites;


import lombok.*;

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
public class Moniteur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num_moniteur;

    private String nomM;
    private  String prenomM;
    private LocalDate dateRecu;
    @OneToMany
    private List<Cours> coursList ;


}

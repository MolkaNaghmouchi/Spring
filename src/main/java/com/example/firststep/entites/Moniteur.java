package com.example.firststep.entites;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
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
public class Moniteur {

    @Id
    private Long num_moniteur;

    private String nomM;
    private  String prenomM;
    private LocalDate dateRecu;
    @OneToMany
    private List<Cours> coursList ;


}

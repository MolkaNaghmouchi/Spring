package com.example.firststep.entites;


import com.example.firststep.enu.Couleur;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class Piste implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numPiste ;
    private  String nomPiste;
    @Enumerated
    private Couleur couleur;

@ManyToMany(mappedBy = "pisteList")
    private List<Skieur> skieurList;
}

package com.example.firststep.entites;

import com.example.firststep.enu.Couleur;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Piste {

    @Id
    private Long numPiste ;
    private  String nomPiste;
    private Couleur couleur;

@ManyToMany
    private List<Skieur> skieurList;
}

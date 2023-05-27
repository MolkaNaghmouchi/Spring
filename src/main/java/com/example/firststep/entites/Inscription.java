package com.example.firststep.entites;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Inscription {
    @Id
    private Long numInscription;
private int numSemaine ;
@ManyToOne
    private  Skieur skieur;
    @ManyToOne
    private  Cours cours;

}

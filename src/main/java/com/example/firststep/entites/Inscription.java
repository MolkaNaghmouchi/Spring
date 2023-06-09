package com.example.firststep.entites;

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
@EqualsAndHashCode
public class Inscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numInscription;
private int numSemaine ;
@ManyToOne(cascade=CascadeType.PERSIST)
    private  Skieur skieur;
    @ManyToOne
    private  Cours cours;

}

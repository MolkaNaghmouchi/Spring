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
@EqualsAndHashCode
public class Cours implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num_cour;

    @Enumerated
    private Couleur couleur;

    @OneToMany(mappedBy = "cours")
    private List<Inscription> inscrit;

}

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
public class Cours {

    @Id
    private Long num_cour;
    private String VERT;

    private String BLEU;
    private String ROUGE;
    private String NOIR;
    @OneToMany(mappedBy = "cours")
    private List<Inscription> inscrit;

}

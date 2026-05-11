package org.ouardia.examanjee.entites;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("SANTE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContratSante extends ContratAssurance {
    private String niveauCouverture; // Basique, Intermédiaire, Premium
    private int nombrePersonnes;
}

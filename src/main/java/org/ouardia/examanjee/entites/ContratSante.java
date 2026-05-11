package org.ouardia.examanjee.entites;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ouardia.examanjee.enums.niveauCouverture;

@Entity
@DiscriminatorValue("SANTE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContratSante extends ContratAssurance {
    @Enumerated(EnumType.STRING)
    private niveauCouverture niveauCouverture; // Basique, Intermédiaire, Premium
    private int nombrePersonnes;
}

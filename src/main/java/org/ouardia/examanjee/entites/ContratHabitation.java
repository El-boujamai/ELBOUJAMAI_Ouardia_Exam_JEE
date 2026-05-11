package org.ouardia.examanjee.entites;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ouardia.examanjee.enums.TypeLogement;

@Entity
@DiscriminatorValue("HAB")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContratHabitation extends ContratAssurance {
    @Enumerated(EnumType.STRING)
    private TypeLogement typeLogement; // Appartement, Maison, Local commercial
    private String adresse;
    private double superficie;
}

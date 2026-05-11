package org.ouardia.examanjee.entites;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("HAB")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContratHabitation extends ContratAssurance {
    private String typeLogement; // Appartement, Maison, Local commercial
    private String adresse;
    private double superficie;
}

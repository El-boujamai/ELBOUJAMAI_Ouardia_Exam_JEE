package org.ouardia.examanjee.entites;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("AUTO")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContratAuto extends ContratAssurance {
    private String numImmatriculation;
    private String marque;
    private String modele;
}

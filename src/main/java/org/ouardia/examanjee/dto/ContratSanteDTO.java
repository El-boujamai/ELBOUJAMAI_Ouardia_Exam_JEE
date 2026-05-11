package org.ouardia.examanjee.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.ouardia.examanjee.enums.niveauCouverture;

@Data
@EqualsAndHashCode(callSuper = true)
public class ContratSanteDTO extends ContratAssuranceDTO {
    private niveauCouverture niveauCouverture; // Basique, Intermédiaire, Premium
    private int nbPersonnesCouvertes;
}
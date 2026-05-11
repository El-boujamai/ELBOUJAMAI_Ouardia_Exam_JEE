package org.ouardia.examanjee.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.ouardia.examanjee.enums.TypeLogement;

@Data
@EqualsAndHashCode(callSuper = true)
public class ContratHabitationDTO extends ContratAssuranceDTO {
    private TypeLogement typeLogement; // Appartement, Maison, Local commercial
    private String adresse;
    private double superficie;
}
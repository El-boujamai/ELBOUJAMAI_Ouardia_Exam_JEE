package org.ouardia.examanjee.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ouardia.examanjee.enums.StatutContrat;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContratAssuranceDTO {
    private Long id; //
    private Date dateSouscription; //
    private StatutContrat statut; // En cours, Validé, Résilié
    private Date dateValidation; //
    private double montantCotisation; //
    private int dureeContrat; //
    private double tauxCouverture; //
}
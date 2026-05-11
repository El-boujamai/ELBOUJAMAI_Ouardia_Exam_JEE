package org.ouardia.examanjee.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ContratAutoDTO extends ContratAssuranceDTO {
    private String numImmatriculation; //
    private String marque; //
    private String modele; //
}

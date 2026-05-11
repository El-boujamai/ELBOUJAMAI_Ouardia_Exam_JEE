package org.ouardia.examanjee.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ouardia.examanjee.enums.TypePaiement;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private double montant;
    @Enumerated(EnumType.STRING)
    private TypePaiement type; // Mensualité, Paiement annuel, Paiement exceptionnel

    @ManyToOne
    private ContratAssurance contrat;
}

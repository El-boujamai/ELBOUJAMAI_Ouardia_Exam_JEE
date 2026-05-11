package org.ouardia.examanjee.reposetory;

import org.ouardia.examanjee.entites.ContratSante;
import org.ouardia.examanjee.entites.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaiementRepository extends JpaRepository<Paiement, Long> {
}

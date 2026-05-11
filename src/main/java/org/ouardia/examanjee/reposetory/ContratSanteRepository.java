package org.ouardia.examanjee.reposetory;

import org.ouardia.examanjee.entites.ContratHabitation;
import org.ouardia.examanjee.entites.ContratSante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratSanteRepository extends JpaRepository<ContratSante, Long> {
}

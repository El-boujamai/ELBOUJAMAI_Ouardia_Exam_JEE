package org.ouardia.examanjee.reposetory;

import org.ouardia.examanjee.entites.ContratAssurance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Arrays;

public interface ContratAssuranceRepository  extends JpaRepository<ContratAssurance, Long> {
    Arrays findByClientId(Long clientId);
}

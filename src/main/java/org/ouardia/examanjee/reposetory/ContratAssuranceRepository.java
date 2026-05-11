package org.ouardia.examanjee.reposetory;

import org.ouardia.examanjee.entites.ContratAssurance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Arrays;
import java.util.List;

public interface ContratAssuranceRepository  extends JpaRepository<ContratAssurance, Long> {
    List<ContratAssurance> findByClientId(Long clientId);
}

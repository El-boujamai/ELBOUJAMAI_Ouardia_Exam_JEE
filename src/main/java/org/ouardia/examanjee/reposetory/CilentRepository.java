package org.ouardia.examanjee.reposetory;

import org.ouardia.examanjee.entites.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CilentRepository extends JpaRepository<Client, Long> {
}

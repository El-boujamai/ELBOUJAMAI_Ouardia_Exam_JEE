package org.ouardia.examanjee.service;



import org.ouardia.examanjee.dto.*;
import java.util.List;

public interface IAssuranceService {
    ClientDTO saveClient(ClientDTO clientDTO);
    List<ClientDTO> listClients();
    ContratAutoDTO saveContratAuto(ContratAutoDTO dto, Long clientId);
    ContratHabitationDTO saveContratHabitation(ContratHabitationDTO dto, Long clientId);
    List<ContratAutoDTO> getContratsAutoByClient(Long clientId);
}

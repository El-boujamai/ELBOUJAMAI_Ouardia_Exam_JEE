package org.ouardia.examanjee.service;


import lombok.AllArgsConstructor;
import org.ouardia.examanjee.dto.*;
import org.ouardia.examanjee.entites.*;
import org.ouardia.examanjee.enums.StatutContrat;
import org.ouardia.examanjee.mapper.AssuranceMapper;
import org.ouardia.examanjee.reposetory.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class AssuranceServiceImpl implements IAssuranceService {
    private CilentRepository clientRepository;
    private ContratAssuranceRepository contratRepository;
    private AssuranceMapper mapper;

    @Override
    public ClientDTO saveClient(ClientDTO clientDTO) {
        Client client = mapper.fromClientDTO(clientDTO);
        return mapper.fromClient(clientRepository.save(client));
    }

    @Override
    public List<ClientDTO> listClients() {
        return clientRepository.findAll().stream()
                .map(mapper::fromClient)
                .collect(Collectors.toList());
    }

    @Override
    public ContratAutoDTO saveContratAuto(ContratAutoDTO dto, Long clientId) {
        Client client = clientRepository.findById(clientId).orElseThrow();
        ContratAuto auto = mapper.fromContratAutoDTO(dto);
        auto.setClient(client);
        auto.setStatut(StatutContrat.EN_COURS);
        return mapper.fromContratAuto(contratRepository.save(auto));
    }

    @Override
    public ContratHabitationDTO saveContratHabitation(ContratHabitationDTO dto, Long clientId) {
        Client client = clientRepository.findById(clientId).orElseThrow();
        ContratHabitation hab = mapper.fromContratHabitationDTO(dto);
        hab.setClient(client);
        hab.setStatut(StatutContrat.EN_COURS);
        return mapper.fromContratHabitation(contratRepository.save(hab));
    }

    @Override
    public List<ContratAutoDTO> getContratsAutoByClient(Long clientId) {
        // Correction ici : Assurez-vous que l'appel retourne une List
        List<ContratAssurance> contrats = contratRepository.findByClientId(clientId);

        if (contrats == null) return new ArrayList<>();

        return contrats.stream()
                .filter(c -> c instanceof ContratAuto)
                .map(c -> mapper.fromContratAuto((ContratAuto) c))
                .collect(Collectors.toList());
    }
}
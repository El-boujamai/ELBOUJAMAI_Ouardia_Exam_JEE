package org.ouardia.examanjee.mapper;

import org.ouardia.examanjee.dto.*;
import org.ouardia.examanjee.entites.*;
import org.ouardia.examanjee.enums.StatutContrat;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class AssuranceMapper {

    public ClientDTO fromClient(Client client) {
        ClientDTO dto = new ClientDTO();
        BeanUtils.copyProperties(client, dto);
        return dto;
    }

    public Client fromClientDTO(ClientDTO dto) {
        Client client = new Client();
        BeanUtils.copyProperties(dto, client);
        return client;
    }

    public ContratAutoDTO fromContratAuto(ContratAuto auto) {
        ContratAutoDTO dto = new ContratAutoDTO();
        BeanUtils.copyProperties(auto, dto);
        dto.setStatut(StatutContrat.valueOf(auto.getStatut().name()));
        return dto;
    }

    public ContratAuto fromContratAutoDTO(ContratAutoDTO dto) {
        ContratAuto auto = new ContratAuto();
        BeanUtils.copyProperties(dto, auto);
        return auto;
    }

    public ContratHabitationDTO fromContratHabitation(ContratHabitation hab) {
        ContratHabitationDTO dto = new ContratHabitationDTO();
        BeanUtils.copyProperties(hab, dto);
        dto.setStatut(StatutContrat.valueOf(hab.getStatut().name()));
        return dto;
    }

    public ContratHabitation fromContratHabitationDTO(ContratHabitationDTO dto) {
        ContratHabitation habitation = new ContratHabitation();
        BeanUtils.copyProperties(dto, habitation);
        return habitation;
    }
}
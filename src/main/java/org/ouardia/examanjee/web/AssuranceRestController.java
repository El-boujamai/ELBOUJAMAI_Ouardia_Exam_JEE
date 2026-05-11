package org.ouardia.examanjee.web;

import lombok.AllArgsConstructor;
import org.ouardia.examanjee.dto.*;
import org.ouardia.examanjee.service.IAssuranceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
@CrossOrigin("*")
public class AssuranceRestController {
    private IAssuranceService assuranceService;

    @GetMapping("/clients")
    public List<ClientDTO> clients() {
        return assuranceService.listClients();
    }

    @PostMapping("/clients")
    public ClientDTO saveClient(@RequestBody ClientDTO clientDTO) {
        return assuranceService.saveClient(clientDTO);
    }

    @PostMapping("/clients/{clientId}/contrats/auto")
    public ContratAutoDTO saveAuto(@RequestBody ContratAutoDTO dto, @PathVariable Long clientId) {
        return assuranceService.saveContratAuto(dto, clientId);
    }

    @PostMapping("/clients/{clientId}/contrats/habitation")
    public ContratHabitationDTO saveHab(@RequestBody ContratHabitationDTO dto, @PathVariable Long clientId) {
        return assuranceService.saveContratHabitation(dto, clientId);
    }

    @GetMapping("/clients/{clientId}/contrats/auto")
    public List<ContratAutoDTO> getAutoByClient(@PathVariable Long clientId) {
        return assuranceService.getContratsAutoByClient(clientId);
    }
}
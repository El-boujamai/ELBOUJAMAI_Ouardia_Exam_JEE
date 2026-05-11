package org.ouardia.examanjee;

import org.ouardia.examanjee.entites.*;
import org.ouardia.examanjee.enums.StatutContrat;
import org.ouardia.examanjee.enums.TypeLogement;
import org.ouardia.examanjee.enums.TypePaiement;
import org.ouardia.examanjee.enums.niveauCouverture;
import org.ouardia.examanjee.reposetory.CilentRepository;
import org.ouardia.examanjee.reposetory.ContratAssuranceRepository;
import org.ouardia.examanjee.reposetory.PaiementRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class ExamanJeeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamanJeeApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CilentRepository clientRepository,
                            ContratAssuranceRepository contratRepository,
                            PaiementRepository paiementRepository) {
        return args -> {
            // 1. Alimentation des Clients [cite: 11]
            Stream.of("Ouardia", "Yassine", "Hamza").forEach(nom -> {
                Client client = new Client();
                client.setNom(nom);
                client.setEmail(nom.toLowerCase() + "@enset-media.ac.ma");
                clientRepository.save(client);
            });

            clientRepository.findAll().forEach(client -> {
                // 2. Test Contrat Automobile [cite: 7, 13]
                ContratAuto auto = new ContratAuto();
                auto.setDateSouscription(new Date());
                auto.setStatut(StatutContrat.EN_COURS); // Utilisation de l'Enum
                auto.setMontantCotisation(1500.0);
                auto.setMarque("Dacia");
                auto.setModele("Logan");
                auto.setNumImmatriculation("12345-A-6");
                auto.setClient(client);
                contratRepository.save(auto);

                // 3. Test Contrat Habitation [cite: 8, 14, 16]
                ContratHabitation habitation = new ContratHabitation();
                habitation.setDateSouscription(new Date());
                habitation.setStatut(StatutContrat.VALIDE); // Utilisation de l'Enum
                habitation.setMontantCotisation(3000.0);
                habitation.setTypeLogement(TypeLogement.Appartement); // Utilisation de l'Enum
                habitation.setAdresse("Boulevard Hassan II, Mohammedia");
                habitation.setSuperficie(90.0);
                habitation.setClient(client);
                contratRepository.save(habitation);

                // 4. Test Contrat Santé
                ContratSante sante = new ContratSante();
                sante.setDateSouscription(new Date());
                sante.setStatut(StatutContrat.EN_COURS);
                sante.setNiveauCouverture(niveauCouverture.Premium); // Utilisation de l'Enum
                sante.setNombrePersonnes(4);
                sante.setClient(client);
                contratRepository.save(sante);

                // 5. Test des Paiements [cite: 10, 21]
                Paiement p1 = new Paiement();
                p1.setDate(new Date());
                p1.setMontant(500.0);
                p1.setType(TypePaiement.MENSUALITE); // Utilisation de l'Enum
                p1.setContrat(auto);
                paiementRepository.save(p1);
            });

            System.out.println(">>> Couche DAO testée avec succès pour la FILIÈRE BDCC !");
        };
    }
}

package org.ouardia.examanjee.entites;

import jakarta.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // [cite: 11]
    private String nom; // [cite: 11]
    private String email; // [cite: 11]

    @OneToMany(mappedBy = "client")
    private List<ContratAssurance> contrats; //
}
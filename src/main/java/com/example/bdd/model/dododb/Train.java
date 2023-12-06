package com.example.bdd.model.dododb;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ligne_id")
    private Ligne ligne;

    @Column(name = "prochain_depart")
    private Instant prochainDepart;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Ligne getLigne() {
        return ligne;
    }

    public void setLigne(Ligne ligne) {
        this.ligne = ligne;
    }

    public Instant getProchainDepart() {
        return prochainDepart;
    }

    public void setProchainDepart(Instant prochainDepart) {
        this.prochainDepart = prochainDepart;
    }

}
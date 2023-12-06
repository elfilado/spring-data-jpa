package com.example.bdd.model.dododb;

import jakarta.persistence.*;

@Entity
public class Wagon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nature_id")
    private Nature nature;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "capacite_id")
    private Capacite capacite;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "train_id")
    private Train train;

    @Column(name = "marchandise_id")
    private Integer marchandiseId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Nature getNature() {
        return nature;
    }

    public void setNature(Nature nature) {
        this.nature = nature;
    }

    public Capacite getCapacite() {
        return capacite;
    }

    public void setCapacite(Capacite capacite) {
        this.capacite = capacite;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Integer getMarchandiseId() {
        return marchandiseId;
    }

    public void setMarchandiseId(Integer marchandiseId) {
        this.marchandiseId = marchandiseId;
    }

}
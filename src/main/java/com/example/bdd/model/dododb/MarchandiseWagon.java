package com.example.bdd.model.dododb;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Marchandise_Wagon")
public class MarchandiseWagon {
    @EmbeddedId
    private MarchandiseWagonId id;

    public MarchandiseWagonId getId() {
        return id;
    }

    public void setId(MarchandiseWagonId id) {
        this.id = id;
    }

    //TODO [JPA Buddy] generate columns from DB
}
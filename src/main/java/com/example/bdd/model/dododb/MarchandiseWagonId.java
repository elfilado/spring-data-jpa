package com.example.bdd.model.dododb;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class MarchandiseWagonId implements Serializable {
    private static final long serialVersionUID = 2755698549658578296L;
    @Column(name = "marchandise_id", nullable = false)
    private Integer marchandiseId;

    @Column(name = "wagon_id", nullable = false)
    private Integer wagonId;

    public Integer getMarchandiseId() {
        return marchandiseId;
    }

    public void setMarchandiseId(Integer marchandiseId) {
        this.marchandiseId = marchandiseId;
    }

    public Integer getWagonId() {
        return wagonId;
    }

    public void setWagonId(Integer wagonId) {
        this.wagonId = wagonId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MarchandiseWagonId entity = (MarchandiseWagonId) o;
        return Objects.equals(this.marchandiseId, entity.marchandiseId) &&
                Objects.equals(this.wagonId, entity.wagonId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marchandiseId, wagonId);
    }

}
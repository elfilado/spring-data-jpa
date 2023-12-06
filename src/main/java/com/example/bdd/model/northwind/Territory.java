package com.example.bdd.model.northwind;

import jakarta.persistence.*;

@Entity
@Table(name = "Territories")
public class Territory {
    @Id
    @Column(name = "TerritoryID", nullable = false, length = 50)
    private String territoryID;

    @Column(name = "TerritoryDescription", nullable = false, length = 50)
    private String territoryDescription;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RegionID", nullable = false)
    private Region regionID;

    public String getTerritoryID() {
        return territoryID;
    }

    public void setTerritoryID(String territoryID) {
        this.territoryID = territoryID;
    }

    public String getTerritoryDescription() {
        return territoryDescription;
    }

    public void setTerritoryDescription(String territoryDescription) {
        this.territoryDescription = territoryDescription;
    }

    public Region getRegionID() {
        return regionID;
    }

    public void setRegionID(Region regionID) {
        this.regionID = regionID;
    }

}
package com.baron.myapp.business.entity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Honey {

    private int id;
    private String type;
    private String flower;
    private String healthbenefit;
    private String vitamins;
    private int tastiness;

    public Honey() {
    }

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFlower() {
        return flower;
    }

    public void setFlower(String flower) {
        this.flower = flower;
    }

    public String getHealthbenefit() {
        return healthbenefit;
    }

    public void setHealthbenefit(String healthbenefit) {
        this.healthbenefit = healthbenefit;
    }

    public String getVitamins() {
        return vitamins;
    }

    public void setVitamins(String vitamins) {
        this.vitamins = vitamins;
    }

    public int getTastiness() {
        return tastiness;
    }

    public void setTastiness(int tastiness) {
        this.tastiness = tastiness;
    }
}

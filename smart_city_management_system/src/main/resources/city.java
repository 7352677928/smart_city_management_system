package com.example.smartcitymanagement.models;

import javax.persistence.*;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String region;
    private int population;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }

    public int getPopulation() { return population; }
    public void setPopulation(int population) { this.population = population; }
}

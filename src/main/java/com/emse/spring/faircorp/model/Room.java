package com.emse.spring.faircorp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ROOM")
public class Room {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable=false, length=255)
    private String name;

    @Column(nullable=false)
    private int floor;

    @Column(nullable = true)
    private Double currentTemperature;
    @Column(nullable = true)
    private Double targetTemperature;

    @OneToMany(mappedBy = "room",fetch = FetchType.EAGER)
    private List<Heater> heaters;

    @OneToMany(mappedBy = "room")
    private List<Window> windows;

    @ManyToOne
    private Building building;

    public Room(){

    }

    //public Room(Long id, String name, int floorNumber, Double currentTemperature, Double targetTemperature, List<Heater> heaters, List<Window> windows, Building building) {
        //this.id = id;
        //this.name = name;
        //this.floor = floor;
        //this.currentTemperature = currentTemperature;
        //this.targetTemperature = targetTemperature;
        //this.heaters = heaters;
        //this.windows = windows;
        //this.building = building;
    //}

    public Room(String name, int floor,Building building) {
        this.name = name;
        this.floor = floor;
        this.building = building;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(Double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public Double getTargetTemperature() {
        return targetTemperature;
    }

    public void setTargetTemperature(Double targetTemperature) {
        this.targetTemperature = targetTemperature;
    }

    public List<Heater> getHeaters() {
        return heaters;
    }

    public void setHeaters(List<Heater> heaters) {
        this.heaters = heaters;
    }

    public List<Window> getWindows() {
        return windows;
    }

    public void setWindows(List<Window> windows) {
        this.windows = windows;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }


}

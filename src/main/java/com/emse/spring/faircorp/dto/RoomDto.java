package com.emse.spring.faircorp.dto;

import com.emse.spring.faircorp.model.Heater;
import com.emse.spring.faircorp.model.Room;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class RoomDto {

    private Long id;
    private String name;
    private int floor;
    private Double currentTemperature;
    private Double targetTemperature;
    private Long buildingId;

    private List<HeaterDto> heaters;
    private  List<WindowDto> windows;

    public RoomDto() {
    }

    public RoomDto(Room room) {
        this.id = room.getId();
        this.name = room.getName();
        this.floor = room.getFloor();
        this.currentTemperature = room.getCurrentTemperature();
        this.targetTemperature = room.getTargetTemperature();
        this.buildingId = room.getBuilding().getId();
        this.heaters = Optional.ofNullable(room.getHeaters())
                .orElse(List.of())
                .stream()
                .map(HeaterDto::new)
                .toList();
        this.windows = Optional.ofNullable(room.getWindows())
                .orElse(List.of()).
                stream().
                map(WindowDto::new)
                .toList();
    }

    public Long getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Double getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(Double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Double getTargetTemperature() {
        return targetTemperature;
    }

    public void setTargetTemperature(Double targetTemperature) {
        this.targetTemperature = targetTemperature;
    }

    public List<HeaterDto> getHeaters() {
        return heaters;
    }

    public void setHeaters(List<HeaterDto> heaters) {
        this.heaters = heaters;
    }

    public List<WindowDto> getWindows() {return windows;}

    public void setWindows(List<WindowDto> windows) {
        this.windows = windows;
    }
}

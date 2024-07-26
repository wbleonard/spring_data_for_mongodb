package com.att.treasurehunt.entity;

import java.util.List;

public class Location {
    private List<Double> coordinates;
    private String type;

    // Getters and setters

    public List<Double> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Double> coordinates) {
        this.coordinates = coordinates;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

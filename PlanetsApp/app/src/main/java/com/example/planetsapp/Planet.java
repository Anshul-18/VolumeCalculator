package com.example.planetsapp;

//it will be acting as model class for our listview.its primary purpose is to hold data,
//models class holds attributes of different items.
public class Planet {
    //attributes
    private String planetName;
    private String moonCount;

    private int planetImage;
    //NOTE:images are not stored inside variables.
    //resource identifiers represented as INT values are used to efficiently manage and access images.

    //constructors
    public Planet(String planetName, String moonCount, int planetImage) {
        this.planetName = planetName;
        this.moonCount = moonCount;
        this.planetImage = planetImage;
    }

    //Getters & Setters
    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public String getMoonCount() {
        return moonCount;
    }

    public void setMoonCount(String moonCount) {
        this.moonCount = moonCount;
    }

    public int getPlanetImage() {
        return planetImage;
    }

    public void setPlanetImage(int planetImage) {
        this.planetImage = planetImage;
    }
}

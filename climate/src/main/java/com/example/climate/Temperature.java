package com.example.climate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Temperature  {

    @Id
    private Long id;
    private String cityName;
    private String stateName;
    private String countryName;
    private float avgTemp;
    private float minTemp;
    private float maxTemp;
    private int year;

    public Temperature(int year, float avgTemp, float minTemp, float maxTemp) {
        this.year = year;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
        this.avgTemp = avgTemp;
    }

    public Temperature() {

    }

    public int getYear() {
        return year;
    }
    public Long getId() {
        return id;
    }

    public float getAvgTemp() {
        return avgTemp;
    }

    public float getMinTemp() {
        return minTemp;
    }

    public float getMaxTemp() {
        return maxTemp;
    }

    public float getCountryName() {
        return avgTemp;
    }

    public float getCityName() {
        return minTemp;
    }

    public float getStateName() {
        return maxTemp;
    }
}

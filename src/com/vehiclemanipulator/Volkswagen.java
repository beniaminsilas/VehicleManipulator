package com.vehiclemanipulator;

public class Volkswagen extends AutoVehicle {
    protected String carType;
    protected int fuelTankSize;
    protected String fuelType;
    protected int maxGearNumber;

    public Volkswagen(String carType, int fuelTankSize, String fuelType, int maxGearNumber) {
        this.carType = carType;
        this.fuelTankSize = fuelTankSize;
        this.fuelType = fuelType;
        this.maxGearNumber = maxGearNumber;
    }
}

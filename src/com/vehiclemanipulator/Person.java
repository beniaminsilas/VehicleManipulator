package com.vehiclemanipulator;

public class Person implements Accelerates, Breaks {
    AutoVehicle carToDrive = new AutoVehicle();

    public Person(AutoVehicle carToDrive) {
        this.carToDrive = carToDrive;
    }

    @Override
    public void accelerate() {
        System.out.println("I just run faster!");
    }

    @Override
    public void reduceSpeed() {
        System.out.println("I just run slower!");
    }

    public void readCurrentFuel() {
        this.carToDrive.displayCurrentFuel();
    }

    public void readCurrentGear() {
        this.carToDrive.displayCurrentGear();
    }

    public void readCurrentFuel(AutoVehicleDisplay autoVehicleDisplay) {
        autoVehicleDisplay.displayCurrentFuel();
    }

    public void readCurrentGear(AutoVehicleDisplay autoVehicleDisplay) {
        autoVehicleDisplay.displayCurrentGear();
    }
}

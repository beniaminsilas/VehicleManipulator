package com.vehiclemanipulator;

public abstract class Vehicle implements Accelerates, Breaks, Drivable {

    protected double speed = 0d;
    protected double totalCoveredDistance = 0d;
    protected boolean isStarted = false;

    @Override
    public void accelerate() {
        speed += getAccelerationSpeed();
    }

    protected abstract double getAccelerationSpeed();

    public void drive(Double distance) {
        totalCoveredDistance += distance;
    }

    @Override
    public void start() {

        if (isStarted) {
            System.out.println("Cannot start a started vehicle!");
            return;
        }

        isStarted = true;
    }

    @Override
    public void turn(String direction, Double degrees) {

        if (!isStarted) {
            System.out.println("Cannot turn a vehicle which did not start!");
        } else {

        }
    }

    @Override
    public void stop() {

        if (!isStarted) {
            System.out.println("Cannot stop a stopped vehicle!");
        } else {
            isStarted = false;
        }

    }
}

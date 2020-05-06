package com.vehiclemanipulator;

public interface Drivable {
    void start();
    void drive(Double distance);
    void turn(String direction, Double degrees);
    void stop();
}

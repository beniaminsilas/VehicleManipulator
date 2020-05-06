package com.vehiclemanipulator;

    public class AutoVehicle extends Vehicle implements AutoVehicleDisplay {

        private static final double AVG_CONSUMPTION_PER_KM = 8;

        private double remainingFuel = 0d;
        private Integer currentGear;

        public void setRemainingFuel(double remainingFuel) {
            this.remainingFuel = remainingFuel;
        }

        public Integer getCurrentGear() {
            return currentGear;
        }

        public void setCurrentGear(Integer currentGear) {
            this.currentGear = currentGear;
        }

        @Override
        public void reduceSpeed() {
            this.speed -= 10;
        }

        public void loadFuel(Double fuelQuantity) {
            remainingFuel += fuelQuantity;
        }

        @Override
        public void start() {
            super.start();
            currentGear = 0;
        }

        public void drive(Double distance) {

            super.drive(distance);
            double consumedFuel = distance * 100 / AVG_CONSUMPTION_PER_KM;

            if (consumedFuel > remainingFuel) {
                System.out.println("You cannot drive more km than your current fuel permits!");
                return;
            }

            remainingFuel -= consumedFuel;
        }

        @Override
        public void turn(String direction, Double degrees) {
            super.turn(direction, degrees);
        }

        @Override
        public void stop() {
            super.stop();

            currentGear = null;
        }

        @Override
        protected double getAccelerationSpeed() {
            return 10;
        }

        public double getRemainingFuel() {
            return remainingFuel;
        }

        @Override
        public void displayCurrentGear() {
            if (currentGear == null) {
                System.out.println("The vehicle is stopped.");
            } else {
                System.out.println("The current gear is: " + currentGear);
            }
        }

        @Override
        public void displayCurrentFuel() {
            if (remainingFuel < 0) {
                System.out.println("Something went terribly wrong.");
            } else {
                System.out.println("The current fuel is: " + remainingFuel);
            }
        }
    }


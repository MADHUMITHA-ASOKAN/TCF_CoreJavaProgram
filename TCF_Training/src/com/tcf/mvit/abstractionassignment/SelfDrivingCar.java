package com.tcf.mvit.abstractionassignment;

public class SelfDrivingCar extends VehicleAI {
    private String laneDetectionModel;
    private double brakeSensitivity;

    public SelfDrivingCar(String vehicleID, double currentSpeed, double[] locationCoordinates,
                          String laneDetectionModel, double brakeSensitivity) {
        super(vehicleID, currentSpeed, locationCoordinates);
        this.laneDetectionModel = laneDetectionModel;
        this.brakeSensitivity = brakeSensitivity;
    }

    @Override
    public void navigate() {
        System.out.println("Car " + vehicleID + " navigating urban streets using " + laneDetectionModel + ".");
    }

    @Override
    public void adjustSpeed(double targetSpeed) {
        System.out.println("Car " + vehicleID + " adjusting speed from " + currentSpeed + " to " + targetSpeed + " km/h.");
        currentSpeed = targetSpeed;
    }

    @Override
    public void detectObstacles() {
        System.out.println("Car " + vehicleID + " detecting obstacles with brake sensitivity: " + brakeSensitivity);
    }
}




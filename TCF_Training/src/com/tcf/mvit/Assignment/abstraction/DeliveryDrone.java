package com.tcf.mvit.Assignment.abstraction;

public class DeliveryDrone extends VehicleAI {
    private double altitude;
    private double payloadWeight;

    public DeliveryDrone(String vehicleID, double currentSpeed, double[] locationCoordinates,
                         double altitude, double payloadWeight) {
        super(vehicleID, currentSpeed, locationCoordinates);
        this.altitude = altitude;
        this.payloadWeight = payloadWeight;
    }

    @Override
    public void navigate() {
        System.out.println("Drone " + vehicleID + " flying at altitude " + altitude + " meters.");
    }

    @Override
    public void adjustSpeed(double targetSpeed) {
        System.out.println("Drone " + vehicleID + " adjusting airspeed from " + currentSpeed + " to " + targetSpeed + " km/h.");
        currentSpeed = targetSpeed;
    }

    @Override
    public void detectObstacles() {
        System.out.println("Drone " + vehicleID + " detecting aerial obstacles while carrying payload: " + payloadWeight + " kg.");
    }
}


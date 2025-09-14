package com.tcf.mvit.Assignment.abstraction;



//Abstract Class
public abstract class VehicleAI {
 protected String vehicleID;
 protected double currentSpeed;
 protected double[] locationCoordinates; // [x, y] position

 public VehicleAI(String vehicleID, double currentSpeed, double[] locationCoordinates) {
     this.vehicleID = vehicleID;
     this.currentSpeed = currentSpeed;
     this.locationCoordinates = locationCoordinates;
 }

 // Abstract methods
 public abstract void navigate();
 public abstract void adjustSpeed(double targetSpeed);
 public abstract void detectObstacles();

 // Concrete method
 public void logTelemetry() {
     System.out.println("Telemetry Log -> ID: " + vehicleID +
             ", Speed: " + currentSpeed +
             " km/h, Location: (" + locationCoordinates[0] + ", " + locationCoordinates[1] + ")");
 }
}

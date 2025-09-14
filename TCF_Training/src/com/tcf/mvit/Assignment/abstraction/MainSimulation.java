package com.tcf.mvit.Assignment.abstraction;

public class MainSimulation {
    public static void main(String[] args) {
        // Self Driving Car
        SelfDrivingCar car = new SelfDrivingCar("CAR123", 40, new double[]{12.5, 45.7}, "YOLO-LaneNet", 0.8);
        car.navigate();
        car.adjustSpeed(60);
        car.detectObstacles();
        car.logTelemetry();

        System.out.println();

        // Delivery Drone
        DeliveryDrone drone = new DeliveryDrone("DRONE007", 30, new double[]{5.2, 18.4}, 120.5, 2.3);
        drone.navigate();
        drone.adjustSpeed(50);
        drone.detectObstacles();
        drone.logTelemetry();
    }
}


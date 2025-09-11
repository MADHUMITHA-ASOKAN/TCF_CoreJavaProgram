package com.tcf.multitreading_example;

public class RunnableDemo {
    public static void main(String args[]) {

        // UsingRunnable object (normal class implementing Runnable)
        UsingRunnable u = new UsingRunnable(10, 20, "Karthick");

        // Runnable with lambda expression (simple print)
        Runnable r = () -> {
            System.out.println("Run method overridden by lambda expression");
        };
        Thread t = new Thread(r, "lambda thread");
        t.start();

        // Another Runnable with lambda expression (simple print)
        Runnable r1 = () -> {
            System.out.println("2. Run method overridden by lambda expression");
        };
        Thread t1 = new Thread(r1, "lambda thread");
        t1.start();

        // Runnable with lambda + loop + delay
        Runnable r3 = () -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i + ". hello");
            }
        };
        Thread t3 = new Thread(r3, "lambda thread");
        t3.start();
    }
}
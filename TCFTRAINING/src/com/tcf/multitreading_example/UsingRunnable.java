package com.tcf.multitreading_example;

class UsingRunnable implements Runnable {
    private int start, end;
    private String msg;
    private Thread t;

    public UsingRunnable(int start, int end, String msg) {
        this.start = start;
        this.end = end;
        this.msg = msg;
        this.t = new Thread(this, msg + " thread");
        t.start();  // start the thread
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            try {
                Thread.sleep(1000); // wait 1 sec
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hello " + msg + " " + i);
        }
    }
}


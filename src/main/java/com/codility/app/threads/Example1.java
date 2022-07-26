package com.codility.app.threads;

public class Example1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        try {
            Thread.sleep(10000);
        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }
    }

    public static void main(String[] args) {
        Example1 example1 = new Example1();
        Thread t1 = new Thread(example1);
        t1.start();
    }
}

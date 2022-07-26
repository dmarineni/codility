package com.codility.app.threads;

public class DeadLockSolved {
    public static void main(String[] args) {
        ResourceX resourceX = new ResourceX();
        ResourceY resourceY = new ResourceY();
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                try {
                    synchronized (resourceX) {
                        System.out.println(Thread.currentThread().getName() + " : locked on resourceX");
                        resourceX.print();
                        Thread.sleep(5000);
                        synchronized (resourceY) {
                            System.out.println(Thread.currentThread().getName() + " : locked on resourceY");
                            resourceY.print();
                        }
                    }
                } catch (Exception e){
                    System.out.println(e.getStackTrace());
                }
            }
        };
        Runnable r2 = () -> {
            try {
                synchronized (resourceY) {
                    System.out.println(Thread.currentThread().getName() + " : locked on resourceY");
                    resourceY.print();
                    Thread.sleep(5000);
                    synchronized (resourceX) {
                        System.out.println(Thread.currentThread().getName() + " : locked on resourceX");
                        resourceX.print();
                    }
                }
            } catch (Exception e){
                System.out.println(e.getStackTrace());
            }
        };
        Thread t1 = new Thread(r1, "t1");
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(r2, "t2").start();

    }
}

class ResourceX{
    void print( ){
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                Thread.sleep(500);
            }
        } catch (Exception e){
            System.out.println(e.getStackTrace());
        }
    }
}

class ResourceY{

    void print( ){
        try {
            for (int i = 10; i < 15; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                Thread.sleep(500);
            }
        } catch (Exception e){
            System.out.println(e.getStackTrace());
        }
    }
}
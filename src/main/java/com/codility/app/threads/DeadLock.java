package com.codility.app.threads;

public class DeadLock {
    public static void main(String[] args) {
        Resource1 resource1 = new Resource1();
        Resource2 resource2 = new Resource2();
        ThreadDL1 thread1 = new ThreadDL1(resource1, resource2);
        thread1.setName("t1");
        ThreadDL2 thread2 = new ThreadDL2(resource1, resource2);
        thread2.setName("t2");
        thread1.start();
        thread2.start();
        System.out.println("Program terminating.....");
    }
}

class Resource1{
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

class Resource2{

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

class ThreadDL1 extends Thread{
    Resource1 resource1;
    Resource2 resource2;
    ThreadDL1(Resource1 resource1, Resource2 resource2){
        this.resource1 = resource1;
        this.resource2 = resource2;
    }
    @Override
    public void run() {
        try {
            System.out.println("inside thread : " + Thread.currentThread().getName());
            synchronized (resource1) {
                System.out.println(Thread.currentThread().getName() + " : locked on resource1");
                Thread.sleep(5000);
                resource1.print();
                synchronized (resource2){
                    System.out.println(Thread.currentThread().getName() + " : locked on resource2");
                    resource2.print();
                }
            }
        } catch (Exception e){
            System.out.println(e.getStackTrace());
        }
    }
}

class ThreadDL2 extends Thread{
    Resource1 resource1;
    Resource2 resource2;
    ThreadDL2(Resource1 resource1, Resource2 resource2){
        this.resource1 = resource1;
        this.resource2 = resource2;
    }
    @Override
    public void run() {
        try {
            System.out.println("inside thread : " + Thread.currentThread().getName());
            synchronized (resource2) {
                System.out.println(Thread.currentThread().getName() + " : locked on resource2");
                Thread.sleep(5000);
                resource2.print();
                synchronized (resource1){
                    System.out.println(Thread.currentThread().getName() + " : locked on resource1");
                    resource1.print();
                }
            }
        } catch (Exception e){
            System.out.println(e.getStackTrace());
        }
    }
}

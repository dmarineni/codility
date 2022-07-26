package com.codility.app.threads;

public class MultipleThreadSynchronized {
    public static void main(String[] args) {
        PrintAndDelaySynchronized printAndDelaySynchronized = new PrintAndDelaySynchronized();
        Thread3 thread1 = new Thread3(printAndDelaySynchronized);
        thread1.setName("thread1");
        Thread3 thread2 = new Thread3(printAndDelaySynchronized);
        thread2.setName("thread2");


        Thread thread3 = new Thread(){
            public void run(){
                printAndDelaySynchronized.action(10);
            }
        };
        thread3.setName("thread3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class PrintAndDelaySynchronized{
    synchronized void action(int x){
        try {
            for (int i = 1; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + x*i);
                Thread.sleep(500);
            }
        } catch (Exception e){
            System.out.println(e.getStackTrace());
        }
    }
}

class Thread3 extends Thread{
    PrintAndDelaySynchronized obj;
    Thread3(PrintAndDelaySynchronized printAndDelaySynchronized){
        this.obj = printAndDelaySynchronized;
    }

    @Override
    public void run() {
        obj.action(1);
    }
}

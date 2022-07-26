package com.codility.app.threads;

public class MultipleThreads {
    public static void main(String[] args) {
        PrintAndDelay printAndDelay = new PrintAndDelay();
        Thread1 thread1 = new Thread1(printAndDelay);
        thread1.setName("thread1");
        Thread2 thread2 = new Thread2(printAndDelay);
        thread2.setName("thread2");
        thread1.start();
        thread2.start();
    }
}

class PrintAndDelay {
    void action(int x) {
        try {
            System.out.println("Inside PrintAndDelay from : " + Thread.currentThread().getName());
            for (int i = 1; i < 6; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + x*i);
                Thread.sleep(4000);
            }
        }catch(
        Exception e)

        {
            System.out.println(e.getStackTrace());
        }
    }
}

class Thread1 extends Thread{
    PrintAndDelay obj;
    Thread1(PrintAndDelay printAndDelay){
        this.obj = printAndDelay;
    }

    @Override
    public void run() {
        obj.action(1);
    }
}

class Thread2 extends Thread{
    PrintAndDelay obj;
    Thread2(PrintAndDelay printAndDelay){
        this.obj = printAndDelay;
    }

    @Override
    public void run() {
        obj.action(10);
    }
}

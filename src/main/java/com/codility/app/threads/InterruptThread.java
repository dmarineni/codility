package com.codility.app.threads;

public class InterruptThread {
    public static void main(String[] args) throws InterruptedException {

        Runnable t1 = () -> {
          try{
              System.out.println(Thread.currentThread().getName() + " - IN -");
              Thread.sleep(3000);
              System.out.println(Thread.currentThread().getName() + " : sleep completed");
          }catch (InterruptedException e){
              e.printStackTrace();
          }
            System.out.println(Thread.currentThread().getName() + " - OUT -");
        };
        Runnable t2 = () -> {
            try{
                System.out.println(Thread.currentThread().getName() + " - IN -");
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName() + " : " + i );
                }
                System.out.println(Thread.currentThread().getName() + " : sleep completed");
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " - OUT -");
        };
        Runnable t3 = () -> {
            try{
                System.out.println(Thread.currentThread().getName() + " - IN -");
                for (int i = 1; i < 10; i++) {
                    if(Thread.interrupted()) {
                        System.out.println(Thread.currentThread().getName() + " : interrupted : " + i * 10);
                    }else {
                        System.out.println(Thread.currentThread().getName() + " : not interrupted : " + i * 1);
                    }
                }
                System.out.println(Thread.currentThread().getName() + " : sleep completed");
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " - OUT -");
        };
        Thread thread1 = new Thread(t1, "t1");
        thread1.start();
        thread1.interrupt();
        thread1.join();
        Thread thread2 = new Thread(t2, "t2");
        thread2.start();
        thread2.interrupt();
        thread2.join();
        Thread thread3 = new Thread(t3, "t3");
        thread3.start();
        thread3.interrupt();
        thread3.join();
    }
}



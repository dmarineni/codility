package com.codility.app.threads;

public class MultipleThreadSynchronizedBlock {
    public static void main(String[] args) {
        PrintInSynchronizedBlock printInSynchronizedBlock = new PrintInSynchronizedBlock();
        Thread thread1 = new Thread(){
            public void run(){
                printInSynchronizedBlock.action(1);
            }
        };
        Thread thread2 = new Thread(() -> printInSynchronizedBlock.action(10));
        Thread thread3 = new Thread(){
            public void run(){
                printInSynchronizedBlock.action(100);
            }
        };
        thread1.setName("t1");
        thread2.setName("t2");
        thread3.setName("t3");
        thread1.start();
        thread2.start();
        thread3.start();
    }

}

class PrintInSynchronizedBlock{
    void action(int x){
        try {
            System.out.println("Statement from non-synchronized block : " + Thread.currentThread().getName());
            synchronized (this) {
                System.out.println("Statement from inside synchronized block : " + Thread.currentThread().getName());
                for (int i = 1; i < 6; i++) {
                    System.out.println(Thread.currentThread().getName() + " : " + x*i);
                    Thread.sleep(500);
                }
            }
        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }
    }
}

package com.codility.app.threads;

public class MultipleThreadSynchronizedBlock2 {
    public static void main(String[] args) {
        Sender sender = new Sender();

        SenderThread t1 = new SenderThread(sender, "Message1");
        t1.setName("t1");
        SenderThread t2 = new SenderThread(sender, "Message2");
        t2.setName("t2");
        SenderThread t3 = new SenderThread(sender, "Message3");
        t3.setName("t3");
        SenderThread t4 = new SenderThread(sender, "Message4");
        t4.setName("t4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        Thread t5 = new Thread(() -> {
            String msg = "message5";
            System.out.println(Thread.currentThread().getName() + " preparing to send send out message : " + msg);
            synchronized (sender) {
                sender.send(msg);
            }
        });
        t5.setName("t5");
        t5.start();
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Exiting the program.............");

    }
}

class Sender{
    void send(String msg){
        try {
            System.out.println(Thread.currentThread().getName() + " sending the message : " + msg);
            Thread.sleep(3000);
            System.out.println("message \"" + msg + "\" is sent out successfully from thread "+ Thread.currentThread().getName());
        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }
    }
}

class SenderThread extends Thread{
    Sender sender;
    String message;
    SenderThread(Sender sender, String msg){
        this.sender = sender;
        this.message = msg;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " preparing to send send out message : " + this.message);
            synchronized (sender){
                sender.send(message);
            }
        }catch (Exception e){
            e.getMessage();
        }
    }
}

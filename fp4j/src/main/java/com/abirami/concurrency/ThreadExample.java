package com.abirami.concurrency;

/**
 * Created by Sundaresan Krishnamurthy on 19/09/18.
 */
public class ThreadExample {

    public static void main(String[] args){
        System.out.println( "Thread Example :1 Using Lambda");
        System.out.println("Thread thread1=new Thread(() -> System.out.println(\"Hello World from Runnable!\") );");
        Thread thread1=new Thread(() -> System.out.println("Hello World from Runnable!") );
        thread1.start();

        System.out.println("Thread Example : 2 Using Anonymous subclass");

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                System.out.println("Hello World from subclass!");
            }
        };

        thread2.start();
       // thread1.start();

    }
}

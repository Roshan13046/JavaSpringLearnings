package LockAndSemaphores.ReentrantLock;


import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {

        SharedResource sharedResource1 = new SharedResource();
        ReentrantLock reentrantLock = new ReentrantLock();
        Thread thread1 = new Thread(()->{
            System.out.println("Thread started : "+ Thread.currentThread().getName());
           sharedResource1.producer(reentrantLock);
        });

        SharedResource sharedResource2 = new SharedResource();
        Thread thread2 = new Thread(()->{
            System.out.println("Thread started : " + Thread.currentThread().getName());
            sharedResource2.producer(reentrantLock);
        });

        thread1.start();
        thread2.start();
    }
}

package LockingInJava.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    public static void main(String[] args) {
        ReadWriteLock lock = new ReentrantReadWriteLock();
        SharedRWResource sharedResource = new SharedRWResource();

        Thread thread1 = new Thread(()->{
           sharedResource.producer(lock);
        });

        Thread thread2 = new Thread(()->{
            sharedResource.producer(lock);
        });

        SharedRWResource sharedResource1 = new SharedRWResource();
        Thread thread3 = new Thread(()->{
            sharedResource1.consumer(lock);
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

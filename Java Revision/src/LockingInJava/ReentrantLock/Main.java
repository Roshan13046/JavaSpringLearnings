package LockingInJava.ReentrantLock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {

        ReentrantLock reentrantLock = new ReentrantLock();
        Condition condition = reentrantLock.newCondition();

        SharedResource sharedResource1 = new SharedResource();
        Thread producerThread1 = new Thread(()->{
            sharedResource1.producer(reentrantLock, condition);
        });

        SharedResource sharedResource2 = new SharedResource();
        Thread producerThread2 = new Thread(()->{
            sharedResource2.producer(reentrantLock, condition);
        });

        producerThread1.start();
        producerThread2.start();
    }
}

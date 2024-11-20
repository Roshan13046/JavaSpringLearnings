package LockAndSemaphores.ReadWriteLock;


import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

        Thread thread1 = new Thread(()->{
           sharedResource.producer(readWriteLock);
        });
//Note: Both threads 1 and 2 can read as same time using readlock but thread3 can only write if
// there are no locks present on shared resource

        //Based upon the application use: if app has more frequent and large no of reads and less writes then,
        // read write locks should be used
        Thread thread2 = new Thread(()->{
            sharedResource.producer(readWriteLock);
        });

//        SharedResource sharedResource0 = new SharedResource();
//        Thread thread2 = new Thread(()->{
//            sharedResource0.producer(readWriteLock);
//        });

        SharedResource sharedResource1 = new SharedResource();
        Thread thread3 = new Thread(()->{
            sharedResource1.consumer(readWriteLock);
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

package LockingInJava.StampeLock.PassismisticLocking;


public class Main {

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread thread0 = new Thread(()->{
            sharedResource.producer();
        });

        Thread thread1 = new Thread(()->{
            sharedResource.producer();
        });

        Thread thread2 = new Thread(()->{
            sharedResource.consumer();
        });

        thread2.start();
        thread1.start();
        thread0.start();
        thread2.start();
    }
}

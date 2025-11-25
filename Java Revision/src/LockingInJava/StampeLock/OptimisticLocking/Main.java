package LockingInJava.StampeLock.OptimisticLocking;


public class Main {
    public static void main(String[] args) {
        ShareResource sharedResource = new ShareResource();

        Thread thread1 = new Thread(()->{
           sharedResource.producer();
        });

        Thread thread2 = new Thread(()->{
           sharedResource.producer();
        });

        Thread thread3 = new Thread(()->{
           sharedResource.consumer();
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

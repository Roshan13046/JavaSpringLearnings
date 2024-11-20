package LockAndSemaphores.StampedLock.ReadWriteLock;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread thread1 = new Thread(()->{
           sharedResource.producer();
        });

        Thread thread2 = new Thread(()->{
            sharedResource.consumer();
        });


        thread1.start();
        thread2.start();
    }
}

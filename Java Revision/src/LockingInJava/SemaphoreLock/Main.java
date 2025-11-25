package LockingInJava.SemaphoreLock;


public class Main {

    public static void main(String[] args) {
        SharedResourceSemaphore sharedResourceSemaphore = new SharedResourceSemaphore();

        Thread thread1 = new Thread(()->{
            sharedResourceSemaphore.producer();
        });

        Thread thread2 = new Thread(()->{
            sharedResourceSemaphore.producer();
        });

        Thread thread3 = new Thread(()->{
            sharedResourceSemaphore.producer();
        });

        Thread thread4 = new Thread(()->{
            sharedResourceSemaphore.producer();
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }



}

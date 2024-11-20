package LockAndSemaphores.SemaphoreLock;


public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread thread1 = new Thread(()->{
           sharedResource.producer();
        });

        Thread thread2 = new Thread(()->{
            sharedResource.producer();
        });

        Thread thread3 = new Thread(()->{
            sharedResource.producer();
        });

        Thread thread4 = new Thread(()->{
            sharedResource.producer();
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}

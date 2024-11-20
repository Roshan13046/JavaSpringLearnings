package LockAndSemaphores.SemaphoreLock;

import java.util.concurrent.Semaphore;

public class SharedResource {
    boolean isAvailable = false;
    Semaphore semaphoreLock = new Semaphore(2);

    public void producer(){
//        System.out.println("Producer called by " + Thread.currentThread().getName());
        try{
            System.out.println("Lock acquired by " + Thread.currentThread().getName());
            semaphoreLock.acquire();
            isAvailable = true;
            Thread.sleep(7000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            semaphoreLock.release();
            System.out.println("Lock released by " + Thread.currentThread().getName());

        }
    }
}

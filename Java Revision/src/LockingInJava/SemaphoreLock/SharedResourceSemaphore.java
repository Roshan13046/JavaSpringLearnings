package LockingInJava.SemaphoreLock;

import java.util.concurrent.Semaphore;

public class SharedResourceSemaphore {

    boolean isAvailable = false;
    Semaphore lock = new Semaphore(2);

    public void producer(){
        try{
            lock.acquire();
            System.out.println("Semaphore Lock acquired by " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(6000);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            lock.release();
            System.out.println("Semaphore Lock released by " + Thread.currentThread().getName());
        }
    }
}

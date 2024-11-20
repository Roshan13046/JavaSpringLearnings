package LockAndSemaphores.ReentrantLock;


import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailable = false;

    public void producer(ReentrantLock lock){
        try{
            lock.lock();
            System.out.println("Lock Acquired by " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            lock.unlock();
            System.out.println("Lock released by " + Thread.currentThread().getName());
        }


    }
}

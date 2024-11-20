package LockAndSemaphores.StampedLock.OptimisticLock;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    int val = 10;
    StampedLock stampedLock = new StampedLock();

    public void producer(){
        long stamp =  stampedLock.readLock();
        System.out.println("Read lock acquired by " + Thread.currentThread().getName());
        try{
            val = 11;
            System.out.println("Optimistic Read");
            Thread.sleep(6000);
            if(stampedLock.validate(stamp)){
                System.out.println("Updated val by " + Thread.currentThread().getName());
            }else{
                System.out.println("Rollback operation");
                val = 10;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            stampedLock.unlock(stamp);
            System.out.println("Read lock released by " + Thread.currentThread().getName());
        }
    }

    public void consumer(){
        long stamp = stampedLock.writeLock();
        System.out.println("Write lock acquired by " + Thread.currentThread().getName());
        try{
            val = 9;
            System.out.println("Value updated by "+ Thread.currentThread().getName());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            stampedLock.unlock(stamp);
            System.out.println("Write lock released by " + Thread.currentThread().getName());
        }
    }
}

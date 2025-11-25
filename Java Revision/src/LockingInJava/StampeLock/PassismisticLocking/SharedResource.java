package LockingInJava.StampeLock.PassismisticLocking;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    boolean isAvailable = false;
    StampedLock lock = new StampedLock();

    public void producer(){
        long stamp = lock.readLock();
        System.out.println("Producer Read stamp : " + stamp + " by " + Thread.currentThread().getName());
        try{
            System.out.println("Read Lock acquired by " + Thread.currentThread().getName());
            isAvailable = true;
            System.out.println("Item Produced by " + Thread.currentThread().getName());
            Thread.sleep(5000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            lock.unlockRead(stamp);
            System.out.println("Read lock released by " + Thread.currentThread().getName());
        }
    }


    public void consumer(){
        long stamp = lock.writeLock();
        System.out.println("Consumer write stamp : " + stamp + " by " + Thread.currentThread().getName());
        try{
            System.out.println("Write lock acquired by "+Thread.currentThread().getName());
            isAvailable = false;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            lock.unlockWrite(stamp);
            System.out.println("Write lock released by " + Thread.currentThread().getName());
        }
    }
}

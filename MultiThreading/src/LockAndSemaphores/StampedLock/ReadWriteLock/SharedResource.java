package LockAndSemaphores.StampedLock.ReadWriteLock;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    boolean isAvailable = false;
    StampedLock stampedLock = new StampedLock();

    public void producer(){
        long stamp = stampedLock.readLock();
        try{
            isAvailable = true;
            System.out.println("Read Lock acquired by " + Thread.currentThread().getName());
            Thread.sleep(5000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            stampedLock.unlock(stamp);
            System.out.println("Read Lock released by " + Thread.currentThread().getName());
        }
    }

    public void consumer(){
        long stamp = stampedLock.writeLock();
        try{
            isAvailable = false;
            System.out.println("Write Lock acquired by " + Thread.currentThread().getName() );
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            stampedLock.unlock(stamp);
            System.out.println("Write Lock released by " + Thread.currentThread().getName());
        }
    }
}

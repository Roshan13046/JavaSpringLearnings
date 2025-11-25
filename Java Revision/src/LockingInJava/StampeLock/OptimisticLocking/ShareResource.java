package LockingInJava.StampeLock.OptimisticLocking;

import java.util.concurrent.locks.StampedLock;

public class ShareResource {
    int id = 1;
    StampedLock lock = new StampedLock();

    public void producer(){
        long stamp = lock.tryOptimisticRead();
        try{
            System.out.println("Token optimistic lock");
            id = 2;
            Thread.sleep(6000);
            if(lock.validate(stamp)){
                System.out.println("Valued updated by " + Thread.currentThread().getName());
            } else{
                System.out.println("rollback of work");
                id = 1;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    public void consumer(){
        long stamp = lock.writeLock();
        System.out.println("write lock acquired by : " + Thread.currentThread().getName());
        try{
           id=56;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            lock.unlockWrite(stamp);
        }
    }
}

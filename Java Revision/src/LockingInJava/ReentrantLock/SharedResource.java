package LockingInJava.ReentrantLock;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailable = false;
//    ReentrantLock lock = new ReentrantLock();


    public void producer(ReentrantLock lock, Condition condition){
        try{
            lock.lock();
            System.out.println("Lock acquired by : " + Thread.currentThread().getName());
           isAvailable = true;
//           Thread.sleep(2000);
            condition.await();
        }catch(Exception e){
            System.out.println("Exception " + e.getMessage());
        }finally {
            lock.unlock();
            condition.signal();
            System.out.println("Lock release by " + Thread.currentThread().getName());
        }
    }
}

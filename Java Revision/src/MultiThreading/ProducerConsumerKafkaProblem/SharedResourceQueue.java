package MultiThreading.ProducerConsumerKafkaProblem;

import java.util.LinkedList;
import java.util.Queue;


public class SharedResourceQueue {
    static final int MAX_SIZE = 5;
    static final int DATA = 1;

    Queue<Integer> queue = null ;

    SharedResourceQueue(){
        queue = new LinkedList<>();
    }

    public synchronized void produceItem(){
        System.out.println("produceItem called by thread : " + Thread.currentThread().getName());
        while(queue.size() == MAX_SIZE ){
           try{
               System.out.println("Queue is full so waiting by Thread : " + Thread.currentThread().getName());
               wait();
           }catch (Exception e){
               System.out.println("Exception in produceItem() : " + e.getMessage());
           }
        }

        System.out.println("Item added into queue by Thread: " + Thread.currentThread().getName());
        queue.add(DATA);
        System.out.println("produceItem() NotifyAll() called "  + Thread.currentThread().getName());
        notifyAll();
    }

    public synchronized void consumeItem(){
        System.out.println("consumeItem called by thread : " + Thread.currentThread().getName());
        while(queue.isEmpty()){
            try{
                System.out.println("Queue is empty so waiting by thread : " + Thread.currentThread().getName());
                wait();
            }catch (Exception e){
                System.out.println("Exception in consumeItem() : " + e.getMessage());
            }
        }
        System.out.println("Item consumed from queue by Thread : " + Thread.currentThread().getName());
        queue.poll();
        System.out.println("consumeItem() NotifyAll() called by Thread : " + Thread.currentThread().getName());
        notifyAll();
    }


}

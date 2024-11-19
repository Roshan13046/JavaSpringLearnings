package ProducerConsumerProblemUsingQueue;

import java.util.LinkedList;
import java.util.Queue;

public class SharedBufferQueue {
    Queue<Integer> queueBuffer;
    Integer queueBufferSize;

    public SharedBufferQueue( Integer queueBufferSize) {
        this.queueBufferSize = queueBufferSize;
        this.queueBuffer = new LinkedList<Integer>();
    }

    public synchronized void producer(int item) throws Exception{

        //if queue is full wait for the consumer to consume items first
        while(queueBuffer.size() == queueBufferSize){
            System.out.println("Producer Thread waiting : " + Thread.currentThread().getName());
            wait();
        }

        queueBuffer.add(item);
        System.out.println("Item Produced : " + item + " by Thread : " + Thread.currentThread().getName());
        notify();//it notifies the consumer that there are items to consume now
    }

    public synchronized void consumer() throws Exception{
        //if queue is empty wait for the producer to produce items
        while(queueBuffer.isEmpty()){
            System.out.println("Consumer Thread waiting : " + Thread.currentThread().getName());
            wait();
        }

        Integer itemConsumed = queueBuffer.poll();
        System.out.println("Item Consumed : " + itemConsumed + " by Thread : " + Thread.currentThread().getName());
        notify();//it notifies the producer that the queue size is not yet full, so items can be produced
    }
}

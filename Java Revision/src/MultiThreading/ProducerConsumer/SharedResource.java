package MultiThreading.ProducerConsumer;

public class SharedResource {
    boolean isAvailable = false;

    public synchronized void produceItem(){
//        System.out.println("Inside produceItem () thread: "+ Thread.currentThread().getName());
        isAvailable = true;
        System.out.println("Item made available by thread : " + Thread.currentThread().getName());
        notifyAll();
    }
//    Consumer thread: Thread-0
//    Producer thread : Thread-1
//    Inside consumeItem () called by thread : Thread-0
//    Thread : Thread-0 is waiting for item
//    Item made available by thread : Thread-1
//    Item consumed by : Thread-0

    public synchronized void consumeItem(){
        System.out.println("Inside consumeItem () called by thread : " + Thread.currentThread().getName());
        while(!isAvailable){
            try{
                System.out.println("Thread : " + Thread.currentThread().getName() + " is waiting for item");
                wait();
            }catch (Exception e){
                System.out.println("Exception in consumeItem() : "+e.getMessage());
            }
        }
        System.out.println("Item consumed by : " + Thread.currentThread().getName());
        isAvailable = false;
    }
}

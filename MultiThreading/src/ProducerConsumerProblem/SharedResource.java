package ProducerConsumerProblem;

public class SharedResource {
    boolean itemAvailable = false;

    public synchronized void addItem(){
        System.out.println("Inside addItem() invoked by thread : " + Thread.currentThread().getName());
        try{
            itemAvailable = true;
            System.out.println("item added by "  + Thread.currentThread().getName() + " and invoking all threads which are waiting" );
            notifyAll();//this will make all threads to move to runnable state now
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    public synchronized void consumeItem(){
        System.out.println("Inside consumeItem() invoked by thread : " + Thread.currentThread().getName());

        //using while loop Reason: to avoid "spurious wake ups" sometimes due to system noise
        while(!itemAvailable){
            try{
                System.out.println(" thread " + Thread.currentThread().getName() + " is waiting now");
                wait(); //this will release the Monitor Lock acquired by the object on the resource
                System.out.println("thread "+ Thread.currentThread().getName() +" waiting ended");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println("item consumed by thread : " + Thread.currentThread().getName());
        itemAvailable = false;
    }
}

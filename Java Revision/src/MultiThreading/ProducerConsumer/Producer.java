package MultiThreading.ProducerConsumer;

public class Producer implements Runnable{

    SharedResource sharedResource;

    Producer(SharedResource sharedResource){
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        System.out.println("Producer thread : " + Thread.currentThread().getName());
        try {
            //it is made availbale so that consumer thread wait for some time and after some time producer thread makes
            //it avaialble
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        sharedResource.produceItem();
    }
}

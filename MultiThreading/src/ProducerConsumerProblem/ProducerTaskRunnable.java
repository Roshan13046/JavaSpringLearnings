package ProducerConsumerProblem;

public class ProducerTaskRunnable implements Runnable{

    SharedResource sharedResource;

    public ProducerTaskRunnable(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        System.out.println("Producer Thread : " + Thread.currentThread().getName());
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        sharedResource.addItem();
    }
}

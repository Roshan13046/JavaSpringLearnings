package ProducerConsumerProblem;

public class ConsumerTaskRunnable implements Runnable{
    SharedResource sharedResource;

    public ConsumerTaskRunnable(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        System.out.println("Consumer thread : " + Thread.currentThread().getName());

        sharedResource.consumeItem();

    }
}

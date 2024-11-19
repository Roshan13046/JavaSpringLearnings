package ProducerConsumerProblem;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        //using lambda Expression
//        Thread thread1 = new Thread(()->{
//            sharedResource.consumeItem();
//        });
//
//        Thread thread2 = new Thread(()->{
//            sharedResource.addItem();
//        });
//
//        thread1.start();
//        thread2.start();

        //using Runnable object passed to the threads
        ConsumerTaskRunnable consumerTaskRunnable = new ConsumerTaskRunnable(sharedResource);
        Thread thread1 = new Thread(consumerTaskRunnable);

        ProducerTaskRunnable producerTaskRunnable = new ProducerTaskRunnable(sharedResource);
        Thread thread2 = new Thread(producerTaskRunnable);

        thread1.start();
        thread2.start();
    }
}

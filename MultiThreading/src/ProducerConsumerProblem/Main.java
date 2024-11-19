package ProducerConsumerProblem;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread thread1 = new Thread(()->{
            sharedResource.consumeItem();
        });

        Thread thread2 = new Thread(()->{
            sharedResource.addItem();
        });

        thread1.start();
        thread2.start();
    }
}

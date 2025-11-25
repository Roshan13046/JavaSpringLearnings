package MultiThreading.ProducerConsumer;

public class Main {

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread consumerThread = new Thread(new Consumer(sharedResource));
        Thread producerThread = new Thread(new Producer(sharedResource));


        producerThread.start();
        consumerThread.start();

    }
}

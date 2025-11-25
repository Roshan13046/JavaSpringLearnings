package MultiThreading.ProducerConsumerKafkaProblem;

public class Main {
    public static void main(String[] args) {
        SharedResourceQueue sharedResourceQueue = new SharedResourceQueue();

        System.out.println("Main thread started it's work");

        Thread consumerThread = new Thread(()->{
            System.out.println("Consumer Thread called " + Thread.currentThread().getName());
//            for(int i=0;i<5;i++){
                sharedResourceQueue.consumeItem();
//            }

        });

//        Thread consumerThread2 = new Thread(()->{
//            System.out.println("Consumer Thread called " + Thread.currentThread().getName());
//            sharedResourceQueue.consumeItem();
//        });
//
//        Thread consumerThread3 = new Thread(()->{
//            System.out.println("Consumer Thread called " + Thread.currentThread().getName());
//            sharedResourceQueue.consumeItem();
//        });

        Thread producerThread = new Thread(()->{
            System.out.println("Producer Thread called" + Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//            for(int i=0;i<5;i++){
                sharedResourceQueue.produceItem();
//            }

        });

        consumerThread.start();
//        consumerThread2.start();
        producerThread.start();
//        consumerThread3.start();

        try{
            System.out.println("Main thread is waiting to complete the consumerThread work");
            consumerThread.join();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Main thread is finishing it's work");
    }




}

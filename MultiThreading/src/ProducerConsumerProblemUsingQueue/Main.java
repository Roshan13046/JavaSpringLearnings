package ProducerConsumerProblemUsingQueue;

public class Main {
    public static void main(String[] args) {
        SharedBufferQueue sharedBufferQueue = new SharedBufferQueue(2);

        Thread thread1 = new Thread(()->{
           try{
               for(int i=1; i<=3; i++){
                   sharedBufferQueue.producer(i);
               }
           }catch (Exception e){
               System.out.println(e.getMessage());
           }
        });

        Thread thread2 = new Thread(()->{
            try{
                for(int i=0; i<=5; i++){
                    sharedBufferQueue.consumer();
                }
            }catch (Exception e){

            }
        });

        thread1.start();
        thread2.start();
    }
}

package DeprecitatedMethodsInThreads;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread thread1 = new Thread(()->{
            System.out.println("Thread1 started");
            sharedResource.produce();
        });

        Thread thread2 = new Thread(()->{
            System.out.println("Thread2 started");
            try{
                Thread.sleep(2000);
                sharedResource.produce();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        });

        thread1.start();

        thread2.start();

        try{
            Thread.sleep(2000);
            System.out.println("thread1 is suspended");
            thread1.suspend();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        try{
            Thread.sleep(3000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("thread1 is resumed");
        thread1.resume();

        System.out.println("Main thread has finished exceuting it's task");

    }


}

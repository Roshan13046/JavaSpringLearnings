package DaemonThreads;

import DeprecitatedMethodsInThreads.SharedResource;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inside Main thread");
        SharedResource sharedResource = new SharedResource();
        Thread thread1 = new Thread(()->{
            System.out.println("Thread1 started");
           sharedResource.produce();
        });
        thread1.setDaemon(true);
        thread1.start();

//        try{
//            //it makes sure that main thread has to wait until thread1 completes all it's task
//            thread1.join();
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }

        System.out.println("is Thread1 Daemon Thread: " + thread1.isDaemon());
        System.out.println("Main thread ends");


    }
}

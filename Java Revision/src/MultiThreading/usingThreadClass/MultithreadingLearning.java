package MultiThreading.usingThreadClass;

public class MultithreadingLearning extends Thread{

    @Override
    public void run(){
        System.out.println("inside run method for thread : " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Thread started : " + Thread.currentThread().getName());
        Thread thread = new MultithreadingLearning();
        thread.start();
        System.out.println("Thread ended : " + Thread.currentThread().getName());
    }
}

package MultiThreading;

public class MultithreadingLearning implements Runnable {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Runnable runnableObj = new MultithreadingLearning();
        Thread thread = new Thread(runnableObj);
        thread.start();
        System.out.println("Finish main method: " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("Run method called by thread : "+ Thread.currentThread().getName());
    }
}

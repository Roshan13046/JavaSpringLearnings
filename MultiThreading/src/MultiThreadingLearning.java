public class MultiThreadingLearning implements Runnable{
//Way 1 to create a Thread
    @Override
    public void run() {
        System.out.println("MultiThreadingLearning Run Method : " + Thread.currentThread().getName());
    }
}

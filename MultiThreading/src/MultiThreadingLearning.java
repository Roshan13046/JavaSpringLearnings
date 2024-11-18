public class MultiThreadingLearning implements Runnable{

    @Override
    public void run() {
        System.out.println("Run Method : " + Thread.currentThread().getName());
    }
}

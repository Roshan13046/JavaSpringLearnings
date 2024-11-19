package MonitorLocks;

public class Main {

    public static void main(String[] args) {
        MonitorLockExample monitorLockExample = new MonitorLockExample();
//        Thread thread1 = new Thread(()->{
//           monitorLockExample.task1();
//        });

        //without using Lambda expressions and by passing the runnable object to the thread while it's creation
        MonitorLockRunnable monitorLockRunnable = new MonitorLockRunnable(monitorLockExample);
        Thread thread1 = new Thread(monitorLockRunnable);

        //using Lambda expressions
        Thread thread2 = new Thread(()->{
           monitorLockExample.task2();
        });

        //using Lambda expressions
        Thread thread3 = new Thread(()->{
            monitorLockExample.task3();
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

package MultiThreading.MonitorLockExample;

public class MonitorLock {

    public synchronized void task1(){
        try{
            System.out.println("inside task 1");
            Thread.sleep(10000);
            System.out.println("sleep ended of task 1");
        } catch(Exception e){
            System.out.println( e.getMessage());
        }
    }

    public void task2(){
        System.out.println("Inside task 2, but before synchronized");
        synchronized (this){
            System.out.println("Inside task2, inside synchronized");
        }
    }

    public void task3(){
        System.out.println("task3");
    }

    public static void main(String[] args) {
        MonitorLock obj = new MonitorLock();

//        Thread thread1 = new Thread(
//                ()->{
//                    obj.task1();
//                }
//        );

        MonitorThread1Runnable monitorThread1Runnable = new MonitorThread1Runnable(obj);
        Thread thread1 = new Thread(monitorThread1Runnable);

        Thread thread2 = new Thread(
                ()->{
                    obj.task2();
                }
        );

        Thread thread3 = new Thread(
                ()->{
                    obj.task3();
                }
        );

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

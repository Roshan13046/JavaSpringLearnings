package MonitorLocks;

public class MonitorLockExample {

    public synchronized void task1(){
        try{
            System.out.println("inside task 1");
            Thread.sleep(10000);
            System.out.println("After task 1 Sleep ends");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }


    public void task2(){
        System.out.println("Inside task 2 : before synchronized");
        synchronized (this){
            System.out.println("Inside task 2: After synchronized");
        }
    }

    public void task3(){
        System.out.println("Inside task 3");
    }


}

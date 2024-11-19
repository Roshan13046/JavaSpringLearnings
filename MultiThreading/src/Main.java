//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Way 1: to create a thread by implementing Runnable interface
        System.out.println("Start of Main Method : " + Thread.currentThread().getName());
        MultiThreadingLearning multiThreadingLearningRunnableObject = new MultiThreadingLearning();
        Thread thread = new Thread(multiThreadingLearningRunnableObject);
        thread.start();
        System.out.println("End of Main method: " + Thread.currentThread().getName());

        System.out.println("-----------------------------");
        //Way 2: to create a thread by Extending Thread class
        System.out.println("Way2: Starting Main method: " + Thread.currentThread().getName());
        MTLearning2 mtLearning2Thread = new MTLearning2();
        mtLearning2Thread.start();
        System.out.println("Way2: Ending of Main method: " + Thread.currentThread().getName());
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Start of Main Method");
        MultiThreadingLearning multiThreadingLearningRunnableObject = new MultiThreadingLearning();
        Thread thread = new Thread(multiThreadingLearningRunnableObject);
        thread.start();
        System.out.println("End of Main method: " + thread.getName());
    }
}
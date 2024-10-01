package AnnotationsUsedOverAnotherAnnotation;

public class Main {
    public static void main(String[] args) {
        Peacock peakcock = new Peacock();
        peakcock.canFly();

        //using reflection concept to check Retention annotation type
        System.out.println(peakcock.getClass().getAnnotation(MyCustomAnnotation.class)); // will give AnnotationsUsedOverAnotherAnnotation.MyCustomAnnotation()
        // as Retention Policy is now .RUNTIME so reflection can find the value during RUNTIME
    }
}

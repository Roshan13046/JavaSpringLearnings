package AnnotationsUsedOverAnotherAnnotation;

public class Main {
    public static void main(String[] args) {
        Peacock peakcock = new Peacock();
        peakcock.canFly();

        //using reflection concept to check Retention annotation type
        System.out.println(peakcock.getClass().getAnnotation(MyCustomAnnotation.class)); // will give AnnotationsUsedOverAnotherAnnotation.MyCustomAnnotation()
        // as Retention Policy is now .RUNTIME so reflection can find the value during RUNTIME


        //@Inheritance annotation concept
        System.out.println(new ChildClass().getClass().getAnnotation(MyCustomAnnotationWithInheritance.class));
        //o/p will be null if parent class annotation does not have @inherited added to it's annotation implementation
    }
}

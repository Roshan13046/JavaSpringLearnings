package AnnotationsUsedOverAnotherAnnotation;

@MyCustomAnnotation
public class Peacock implements Bird{
    @Override//check the java doc of @Override annotation to get info about the @Target annotation
    public void canFly() {
        System.out.println("Yes, Peacock can low fly");
    }
}

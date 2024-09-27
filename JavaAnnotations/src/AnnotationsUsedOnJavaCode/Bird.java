package AnnotationsUsedOnJavaCode;

@FunctionalInterface
public interface Bird {
    public void canFly();

//    public void canRun();//will give warning as it has more than one abstract methods
}

package AnnotationsUsedOnJavaCode;

@SuppressWarnings("all")
public class Mobile {

    @Deprecated
    public void hadAntenna(){
        System.out.println("Has Antenna");
    }

    @SuppressWarnings("unused")
    public void hasKeyBoard(){
        System.out.println("Typing keyboard");
    }

    @SuppressWarnings("unused")
    public void unusedMethod(){
        System.out.println("Unsed Method, fields will show warnings");
    }
}

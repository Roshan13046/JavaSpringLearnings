package AnnotationsUsedOnJavaCode;

public class Main {

    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.hadAntenna();//issues deprecated warning on usage
    }
}

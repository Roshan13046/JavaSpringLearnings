package SuperClassSubClassObjectClass;


public class LearningObjectClass {

    public static void main(String[] args) {
        Object obj1 = new Phone(); // object class is super class of all java class

        System.out.println(obj1.getClass());

        Object obj2 = new SmartPhone();
        System.out.println(obj2.getClass());

    }
}

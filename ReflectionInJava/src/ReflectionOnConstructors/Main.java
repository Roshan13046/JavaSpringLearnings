package ReflectionOnConstructors;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
//        Peacock peacock = new Peacock();
        Class peacockClassObject = Peacock.class;

        Constructor[] constructorsList = peacockClassObject.getDeclaredConstructors();
        for(Constructor constructor : constructorsList){
            System.out.println("Modifier: " + Modifier.toString(constructor.getModifiers()));


            constructor.setAccessible(true);
            //We can now create object of singleton class using reflection: V.v.v.Imp interview question
            Peacock peacock = (Peacock) constructor.newInstance();
            peacock.isNationalBird();

            //DisAdv: Reflection breaks the OOPS principle of Encapsulation as it can access the private fields and methods outside of class,
            //And even can create Object of singleton class
        }

    }
}

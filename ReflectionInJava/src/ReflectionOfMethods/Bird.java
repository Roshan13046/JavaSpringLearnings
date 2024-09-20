package ReflectionOfMethods;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Bird {
    Bird(){

    }

    public void canFly(Integer legs, String name, String maxHeight){
        System.out.println("Bird " + name + " can Fly with " + legs + " legs and upto max height : " + maxHeight);
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class classObj = Bird.class;
        Object birdSparrow = classObj.newInstance();
        Method canFlyMethod = classObj.getMethod("canFly", Integer.class, String.class, String.class);
        canFlyMethod.invoke(birdSparrow, 2, "Sparrow", "40 mtrs");
    }
}

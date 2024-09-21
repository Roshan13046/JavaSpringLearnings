package ReflectionOfMethods;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args)  throws NoSuchFieldException, IllegalAccessException{
        //reflection of Methods
        Class animalClassObj = Animal.class;

        //getMethods gives the public methods and interfaces of current and it's parent class
        // and also stores the Object class methods
        Method [] methods = animalClassObj.getMethods();
        for(Method method : methods){
            System.out.println("Method Name: " + method.getName());
            System.out.println("Method ReturnType: " + method.getReturnType());
            System.out.println("Method Declaring class: " + method.getDeclaringClass());
            System.out.println("***********************************************************");
        }


        //if we want to get the all the public and private methods of the current class
        // and exclude the methods of the parent class like ObjectClass then use getDeclaredMethods()
        Method [] declaredMethods = animalClassObj.getDeclaredMethods();
        System.out.println("\n\n\n--------------------------     Declared methods     --------------------------------------");
        for(Method method : declaredMethods){
            System.out.println("Method Name: " + method.getName());
            System.out.println("Method ReturnType: " + method.getReturnType());
            System.out.println("Method Declaring class: " + method.getDeclaringClass());
            System.out.println("***********************************************************");
        }

        //Reflect fields and access it's metaData
        Class animalClassObj2 = Animal.class;

        //getting the public fields
        Field[] fields = animalClassObj2.getFields();
        System.out.println("\n\n\n--------------------------     Fields Reflection     --------------------------------------");
        for(Field field : fields){
            System.out.println("Field Name: " + field.getName());
            System.out.println("Field Type: " + field.getType());
            System.out.println("Field Modifier: " + Modifier.toString(field.getModifiers()));
            System.out.println("***********************************************************");
        }

        //getting the public and private fields
        Field[] declaredFields = animalClassObj2.getDeclaredFields();
        System.out.println("\n\n\n--------------------------  Declared Fields Reflection     --------------------------------------");
        for(Field field : declaredFields){
            System.out.println("Field Name: " + field.getName());
            System.out.println("Field Type: " + field.getType());
            System.out.println("Field Modifier: " + Modifier.toString(field.getModifiers()));
            System.out.println("***********************************************************");
        }

        //setting the field values using reflection
        Class animalClassObj3 = Animal.class;

        Animal animalObj = new Animal();

        //Setting the public field value
        animalObj.breed = "Omnivarious";
        Field field = animalClassObj3.getField("breed");
        System.out.println("Before setting animalObj.breed: " + animalObj.breed);
        field.set(animalObj, "Carnivarious");
        System.out.println("After setting animalObj.breed: " + animalObj.breed);

        //Setting the private field value
    }
}

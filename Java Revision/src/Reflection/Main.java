package Reflection;

import java.lang.reflect.*;

public class Main {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class eagleClass = Eagle.class;

        System.out.println(eagleClass.getName());
        System.out.println(eagleClass.getDeclaredFields());
        System.out.println(eagleClass.getFields());
        System.out.println(Modifier.toString(eagleClass.getModifiers()));
//        System.out.println(eagleClass.getMethod());

        Method[] eagleMethods = eagleClass.getMethods();//returns all the public methods of the class
        for(Method method : eagleMethods){
            System.out.println(method.getName());
            System.out.println(method.getReturnType());
            System.out.println(method.getDeclaringClass());
            System.out.println("*************************************");
        }

        System.out.println("------------------END ---------------------");

        Method[] eagleDeclaredMethods = eagleClass.getDeclaredMethods();
        for(Method method: eagleDeclaredMethods){
            System.out.println(method.getName());
            System.out.println(method.getReturnType());
            System.out.println(method.getDeclaringClass());
            System.out.println("************************************************");
        }
        System.out.println("---------------------METHOD INVOCATION ----------------");
        //invoking the method using reflection
        Class eagleClass2 = Eagle.class;
        Object eagleObject = eagleClass2.newInstance();

        Method flyMethod = eagleClass2.getMethod("fly", int.class);
        flyMethod.invoke(eagleObject, 1);

        Method eatMethod = eagleClass2.getMethod("eat");
        eatMethod.invoke(eagleObject);


        //FIELD INVOCATION USING REFLECTION
        System.out.println("____________________________ FIELD INVOCATION Using Reflection ---------------");
        Class eagle3 = Eagle.class;

//        Field[] fields = eagle3.getFields();
        Field[] fields = eagle3.getDeclaredFields();

        for(Field field : fields){
            System.out.println("field name : " + field.getName());
            System.out.println("field type: " + field.getType());
            System.out.println("field modifier: " + Modifier.toString(field.getModifiers()));
            System.out.println("******************************");
        }

        //setting the value of the public field
        Class eagleClass3 = Eagle.class;
        Eagle eagleObj3 = new Eagle();

        Field field = eagleClass3.getDeclaredField("breed");
        field.set(eagleObj3, "Hawk");
        System.out.println(eagleObj3.breed);

        //Setting the private field of the class using reflection

        Field field1 = eagleClass3.getDeclaredField("canSwim");
        field1.setAccessible(true);
        field1.set(eagleObj3,Boolean.TRUE);
        if (field1.getBoolean(eagleObj3)){
            System.out.println("value is set to true");
        }

        Class eagleClass5 = Eagle.class;
        Constructor[] constructors = eagleClass5.getDeclaredConstructors();

        for(Constructor constructor: constructors){
            constructor.setAccessible(true);
            Eagle eagleObj = (Eagle) constructor.newInstance();
            eagleObj.fly(1);
        }



    }
}

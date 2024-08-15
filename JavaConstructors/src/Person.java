public class Person {
    String name;
    int id;

    private Person(){//no arguments constructor
        name = null;
    }

    private Person(String name){ // constructor
        name = name;
    }

    private Person(int id, String name){
        id = id;
        name = name;
    }

    String Person(String name){ //method
        return name;
    }

    //singleton design pattern using the private constructor
    public static Person getPersonInstance(String name){
        return new Person(name);
    }


}

public class Employee {

    int id;
    String name;

//    Employee(){
//        id = 0;
//        name = null;
//    }
//
//    Employee(String name){
//        name = name;
//        id = 0;
//    }
//
//    Employee(int id, String name){
//        id = id;
//        name = name;
//    }

    //chaining using this keyword
    Employee(){
        this(null);
    }

    Employee(String name){
       this(0, name);
    }

    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

}

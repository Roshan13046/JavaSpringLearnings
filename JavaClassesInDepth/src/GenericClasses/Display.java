package GenericClasses;

import java.util.List;

public class Display {

    //Wild card : Upper Bound syntax
    public void display(List<? extends Vehicle> list){
        ;
    }

    //Unbound wild card type method : used when we don't know the exact type of the object/parameters passed
    //and the computation mostly happens using the methods and properties of object class
    public void computeListUnboundWildCardMethod(List<?> l1, List<?> l2 ){
        Object obj = l1.get(0);
        Object obj2 = l2.get(0);
        System.out.println(obj.equals(obj2));
    }

    //Wild card : Lower Bound syntax
    public void display2(List<? super Bus> list){
        ;
    }

    //wild card type method
    public void computeList(List<? extends Number> l1, List<? super Bus> l2 ){

    }

    //generic type method
    public <T extends Number>void computeList2(List<T> l1, List<T> l2){

    }

    //difference:
//    1) use wildcard if both the data types can differ like one is intlist and other one floatlist and
///    use generic if both the T types are same
//   2) /wild have super and extend keyword generic don't have that
//    3)in generic we can have <K extends Number, V extends Bus, W extends Vehicle> which is not possible in wildcard type
}

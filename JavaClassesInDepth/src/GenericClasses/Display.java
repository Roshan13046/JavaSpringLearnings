package GenericClasses;

import java.util.List;

public class Display {

    //Wild card : Upper Bound syntax
    public void display(List<? extends Vehicle> list){
        ;
    }

    //Wild card : Lower Bound syntax
    public void display2(List<? super Bus> list){
        ;
    }
}

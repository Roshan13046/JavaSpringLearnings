import Machine.Pen;
import Machine.*;
import MathsCalculation.Sum;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {




    public static void main(String[] args) {
        //system defined methods
        System.out.println("SQRT ROOT: " + Math.sqrt(225));

        Machine machine = new Machine();
        System.out.println("Machine Details : "+machine.getMachineDetails());
        System.out.println("Machine Details : "+machine.getMachineDetails("a" , "b"));

        //Note: static methods cannot be overridden, they can just be hidden over one other
        Pen.printPenCompanyBailley();
        SmartPen.printPenCompanyBailley();


        //Variable arguments concept
        Sum sum = new Sum();
        sum.sumOfInteger(1,2);
        sum.sumOfInteger(1,2,34,556,67,78,99,64,23,11);
        sum.sumOfInteger(0, 1,2,3,4,5);
    }
}
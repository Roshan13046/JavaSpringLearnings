import chainingUsingSUper.AtmMachine;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Person person = new Person("Roshan");//param constructor
//        Person person2 = new Person();//default/no argument  constructors

        Person.getPersonInstance("Roshan");
        Employee empoyee1 = new Employee(1,"Roshan");

        //use of super keyword in chaining
        AtmMachine atmMachine = new AtmMachine(1,"Cash Deposit");

    }
}
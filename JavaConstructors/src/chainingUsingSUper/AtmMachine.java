package chainingUsingSUper;

public class AtmMachine extends Machine {

    String machineType;

    AtmMachine(){

    }

    public AtmMachine(int id, String type){

        //Note during super chaining construcotr of parent is called then it's child is called 
        super(id);
        machineType = type;
        System.out.println("ATM Machine constructor is called");
    }
}

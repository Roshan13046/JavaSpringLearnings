package Machine;

public class Machine {
    //user defined Methods
    public int getMachineDetails(){
        return 1;
    }

    //Overloaded Methods
    public String getMachineDetails(int a, int b){
        return "a+b = "+a+b;
    }

    //Overloaded Methods
    public String getMachineDetails(String a, String b ){
        return "a+b = "+a+b;
    }

    //Overloaded Methods
    private int getMachineDetails(int a){
        return a;
    }


}

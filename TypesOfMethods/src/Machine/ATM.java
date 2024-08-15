package Machine;

public class ATM extends Machine{
    public static int id = 1;

    @Override
    public int getMachineDetails(){
        return 1+id;
    }

    //Override Methods
    @Override
    public String getMachineDetails(int a, int b){
        return "a+b = "+a+b;
    }

    public String getMachineCPU (){
        return "AMD RYZEN 10";
    }

}

package LLD_Sytem_Design.stateDesignPattern.WendingMachine;

import java.util.List;

public class VendingMachine {
//    machine.setVendingMachineState(new IdleState(machine));
//        return machine.getCoinList();

   Inventory inventory;

    public Inventory getInventory(){
        return inventory;
    }

    public void setVendingMachineState(State state){

    }

    public List<Coin> getCoinList(){
        return null;
    }


}

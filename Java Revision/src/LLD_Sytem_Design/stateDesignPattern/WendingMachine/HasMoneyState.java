package LLD_Sytem_Design.stateDesignPattern.WendingMachine;

import java.util.List;

public class HasMoneyState extends State{

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine){
        machine.setVendingMachineState(new SelectionState());
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin){
        System.out.println("Accepted coin");
        machine.getCoinList().add(coin);
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine){
        System.out.println("Returned full amount back in the coin dispense tray");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getCoinList();
    }

}

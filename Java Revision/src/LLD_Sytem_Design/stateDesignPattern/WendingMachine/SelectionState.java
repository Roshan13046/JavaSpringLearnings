package LLD_Sytem_Design.stateDesignPattern.WendingMachine;

import java.util.List;

public class SelectionState extends State{

    @Override
    public void chooseProduct(VendingMachine machine, int codeNum) throws Exception{
        Item item = machine.getInventory().getItem(codeNum);

        int paidByUser = 0;
        for(Coin coin: machine.getCoinList()){
            paidByUser = paidByUser + coin.value;
        }

        if(paidByUser < item.getPrice()){
            System.out.println("Insufficient Amount, product you selected is for price : " + item.getPrice() + " and you " + paidByUser);

            refundFullMoney(machine);
            throw  new Exception("insufficient amount");
        } else if(paidByUser >= item.getPrice()){
            if(paidByUser > item.getPrice()){
                getChange(paidByUser.item.getPrice());
            }

            machine.setVendingMachineState(new DispenseState(machine, codeNum));
        }
    }

    @Override
    public int getChange(int returnExtraMoney) throws Exception{
        System.out.println("Returned the change in the coin dispense tray: " + returnExtraMoney);
        return returnExtraMoney;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception{
        System.out.println("Returned the full amount back in the coin Dispense Tray");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getCoinList();
    }
}

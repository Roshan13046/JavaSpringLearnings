package LLD_Sytem_Design.stateDesignPattern.WendingMachine;

public class DispenseState extends State{
    DispenseState(VendingMachine machine, int codeNum) throws Exception{
        System.out.println("Currently Vending Machine is in Dispense State");
        dispenseProduct(machine, codeNum);
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNum) throws Exception{
        System.out.println("Product has been dispensed");
        Item item = machine.getInventory().getItem(codeNum);
        machine.getInventory().updateSoldOutItem(codeNum);
        machine.setVendingMachineState(new IdleState(machine));

        return item;
    }
}

package LLD_Sytem_Design.stateDesignPattern.WendingMachine;

public abstract class IdleState extends State{
    public IdleState(){}

    public IdleState(VendingMachine machine){
//        machine.setCoinList(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine){
       try {
           machine.setVendingMachineState(new HasMoneyState());
       }catch (Exception e){
           throw  e;
       }
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNum){
        machine.getInventory().addItem(item, codeNum);
    }

}

package LLD_Sytem_Design.stateDesignPattern.WendingMachine;

import java.util.List;

public interface State {
     void clickOnInsertCoinButton(VendingMachine vendingMachine);
     void clickOnStartProductSelectionButton(VendingMachine vendingMachine);
     void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception;
     void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception;
     default int getChange(int returnChangeMoney) throws Exception{
         return 0;
     }
     default Item dispenseProduct(VendingMachine vendingMachine, int codeNum) throws Exception{
         return null;
     }

     default List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception{
         return null;
     }

     void updateInventory(VendingMachine vendingMachine, Item item, int codeNum) throws Exception;


}

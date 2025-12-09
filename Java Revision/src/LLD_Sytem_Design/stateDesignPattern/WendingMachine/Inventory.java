package LLD_Sytem_Design.stateDesignPattern.WendingMachine;

import java.util.List;

public class Inventory {
    List<Item> items;

    public Item getItem(int codeNum){
        return items.stream().filter(i -> i.codeNum == codeNum).findAny().get();
    }

    public void addItem(Item item,int codeNum){
        items.add(item);
    }

}

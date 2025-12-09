package LLD_Sytem_Design.ATM_Machine.State;

import javax.smartcardio.Card;

public class IdleState extends AtmState{

    IdleState(){
        System.out.println("Insert Card");
    }

    @Override
    public void insertCard(ATM atm, Card card){
        System.out.println("Card inserted");
        atm.setCurrentAtmState(new HasCardState())
    }
}

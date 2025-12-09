package LLD_Sytem_Design.ATM_Machine.State;

import LLD_Sytem_Design.ATM_Machine.ATM;

import javax.smartcardio.Card;

public class CheckBalanceState extends AtmState{

    public CheckBalanceState() {
    }

    @Override
    public void displayBalance(ATM atm, Card card){
        System.out.println("Your Balance is: " + card.getBankBalance);
        exit(atm);
    }

    @Override
    public void exit(ATM atm){
        returnCard();
        atm.setCurrentAtmState(new IdleState());
        System.out.println("Exit happened");
    }

    @Override
    public void returnCard(){
        System.out.println("Please collect your card");
    }
}

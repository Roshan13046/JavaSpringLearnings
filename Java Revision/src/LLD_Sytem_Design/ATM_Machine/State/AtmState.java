package LLD_Sytem_Design.ATM_Machine.State;

import javax.smartcardio.Card;

public abstract class AtmState {
    public void insertCard(ATM atm, Card card){
        System.out.println("something wrong");
    }

    public void authenticatePin(ATM atm, Card card, int pin){
        System.out.println("something wrong");
    }

    public void selectOperation(ATM atm, Card card, TransactionType transactionType){
        System.out.println("something wrong");
    }

    public void cashWithdrawal(ATM atm, Card card, int amount){
        System.out.println("something wrong");
    }

    public void displayBalance(ATM atm, Card card){
        System.out.println("something wrong");
    }

    public void returnCard(){
        System.out.println("something wrong");
    }

    public void exit(ATM atm){
        System.out.println("something wrong");
    }


}

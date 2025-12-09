package LLD_Sytem_Design.ATM_Machine.State;

import LLD_Sytem_Design.stateDesignPattern.WendingMachine.IdleState;

import javax.smartcardio.Card;

public class HasCardState extends AtmState{

    public HasCardState(){
        System.out.println("Enter your card pin number");
    }

    @Override
    public void authenticatePin(ATM atm, Card card, int pin){
        boolean isCorrectPinEntered = card.isCorrectPinEntered(pin);
        if(isCorrectPinEntered){
            atm.setCurrentAtmState(new SelectOperationState());
        }else{
            System.out.println("Invalid PIN Number");
            exit(atm);
        }
    }

    @Override
    public void exit(ATM atm){
        returnCard();
        atm.setCurrentAtmState(new IdleState());
        System.out.println("Exit happens");
    }

    @Override
    public void returnCard(){
        System.out.println("Please collect your card");
    }

}

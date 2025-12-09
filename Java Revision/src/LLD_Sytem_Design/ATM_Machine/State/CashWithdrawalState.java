package LLD_Sytem_Design.ATM_Machine.State;

import LLD_Sytem_Design.ATM_Machine.ATM;
import LLD_Sytem_Design.ATM_Machine.Card;


public class CashWithdrawalState extends AtmState{

    public CashWithdrawalState(){
        System.out.println("Please enter the withdrawal Amount");
    }

    public void cashWithdrawal(ATM atm, Card card, int amount){
        if(atm.getAtmBalance() < amount){
            System.out.println("Insufficient fund in ATM machine ");
            exit(atm);
        }else if(card.getBankBalance() < amount){
            System.out.println("Insufficient fund in your Bank account");
        }else{
            card.deductBankBalance(amount);
            //this below method will be having chain of responsibility DP
            atm.deductAtmBalance(amount);
            exit(atm);
        }
    }

    @Override
    public void exit(ATM atm){
        returnCard();
        atm.setCurrentAtmState(new IdleState());
        System.out.println("Exit Happened");
    }
}

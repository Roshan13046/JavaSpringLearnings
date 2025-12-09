package LLD_Sytem_Design.ATM_Machine.State;

import LLD_Sytem_Design.stateDesignPattern.WendingMachine.IdleState;

import javax.smartcardio.Card;

public class SelectOperationState extends AtmState{

    public SelectOperationState(){
        showAtmOperations();
    }

    @Override
    public void selectOperations(ATM atm, Card card, TransactionType transactionType){
        switch(transactionType){
            case CASH_WITHDRAWAL:
               atm.setCurrentAtmState(new CashWithdrawalState());
               break;
            case BALANCE_CHECK:
                atm.setCurrentAtmState(new CheckBalanceState());
                break;
            default:
                System.out.println("Invalid Operation");
                exit(atm);
        }
    }

    @Override
    public void exit(ATM atm){
        returnCard();
        atm.setCurrentAtmState(new IdleState());
        System.out.println("Exit Happens");
    }

    @Override
    public void returnCard(){
        System.out.println("Please collect your card");
    }

    private void showAtmOperations(){
        System.out.println("Please select Operation");
        TransactionType.showAllTransactionTypes();
    }

}

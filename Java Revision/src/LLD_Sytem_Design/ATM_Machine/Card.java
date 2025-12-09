package LLD_Sytem_Design.ATM_Machine;

public class Card {
    private int cardNumber, cvv, expiryDate;
    String holderName;
    static int PIN_NUMBER = 123456;
    private UserBankAccount bankAccount;

    public boolean isCorrectPin(int pin){
        if(pin == PIN_NUMBER) return true;

        return false;
    }

    public int getBankBalance(){
        return bankAccount.balance;
    }

    public void deductBankBalance(int amount){
        bankAccount.withDrawlBalance(amount);
    }

    public void setBankAccount(UserBankAccount bankAccount){
        this.bankAccount = bankAccount;
    }
}

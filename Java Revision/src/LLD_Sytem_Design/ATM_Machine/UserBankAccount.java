package LLD_Sytem_Design.ATM_Machine;

public class UserBankAccount {
    int balance;

    public void withdrawalBalance(int amount){
        balance = balance - amount;
    }
}

package LLD_Sytem_Design.Strategy_DP;

public class NetBanking implements PaymentStrategy{
    String accountNo;

    NetBanking(String accountNo){
        this.accountNo = accountNo;
    }

    @Override
    public void doPayment() {
        System.out.println("Net banking payment done : " + accountNo );
    }
}

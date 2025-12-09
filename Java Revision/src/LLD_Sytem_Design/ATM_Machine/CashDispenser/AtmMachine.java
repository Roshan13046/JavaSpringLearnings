package LLD_Sytem_Design.ATM_Machine.CashDispenser;

public class AtmMachine {
    AtmDispenser atmDispenser;

    AtmMachine(){
        Dispenser2000 dispenser2000 = new Dispenser2000();
        Dispenser500 dispenser500 = new Dispenser500();
        Dispenser200 dispenser200 = new Dispenser200();

        dispenser2000.setNextAtmDispenser(dispenser500);
        dispenser500.setNextAtmDispenser(dispenser200);
        dispenser200.setNextAtmDispenser(null);

        atmDispenser = dispenser2000;
    }

    public void dispenseCash(int amount){
        if(amount%100 !=0){
            System.out.println("Amount should be in multiple of 100");
            return;
        }
        atmDispenser.dispense(amount);
    }


}

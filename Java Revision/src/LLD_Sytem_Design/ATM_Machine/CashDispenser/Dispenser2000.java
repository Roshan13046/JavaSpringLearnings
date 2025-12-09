package LLD_Sytem_Design.ATM_Machine.CashDispenser;

public class Dispenser2000 extends AtmDispenser {
    @Override
    public void dispense(int amount) {
        int notes = amount / 2000;
        int remainingAmount = amount % 2000;

        if(notes > 0){
            System.out.println("Dispensing 2000 notes :  " + notes);
        }

        if(remainingAmount > 0 && nextAtmDispenser != null){
            nextAtmDispenser.dispense(remainingAmount);
        }

    }
}

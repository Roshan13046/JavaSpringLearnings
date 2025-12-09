package LLD_Sytem_Design.ATM_Machine.CashDispenser;

public class Dispenser200 extends AtmDispenser {
    @Override
    public void dispense(int amount) {
        int notes = amount / 200;
        int remainingAmount = amount % 200;

        if(notes > 0){
            System.out.println("Dispensing 200 notes : " + notes);
        }

        if(remainingAmount >0 && nextAtmDispenser != null){
            nextAtmDispenser.dispense(remainingAmount);
        }
    }

}

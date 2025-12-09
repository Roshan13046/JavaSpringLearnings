package LLD_Sytem_Design.ATM_Machine.CashDispenser;

public class Dispenser500 extends AtmDispenser {
    @Override
    public void dispense(int amount) {
        int notes = amount / 500;
        int remainingAmount = amount % 500;

        if(notes > 0){
            System.out.println("Dispensing 500 notes : " + notes );
        }

        if(remainingAmount >0 && nextAtmDispenser != null){
            nextAtmDispenser.dispense(remainingAmount);
        }
    }
}

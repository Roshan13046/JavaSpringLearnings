package LLD_Sytem_Design.ATM_Machine.CashDispenser;

public abstract class AtmDispenser {
    AtmDispenser nextAtmDispenser;

    protected void setNextAtmDispenser(AtmDispenser dispenser){
        this.nextAtmDispenser = dispenser;
    }

    public abstract void dispense(int amount);

}

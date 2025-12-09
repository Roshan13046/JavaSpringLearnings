package LLD_Sytem_Design.ATM_Machine;

import LLD_Sytem_Design.ATM_Machine.CashDispenser.AtmMachine;
import LLD_Sytem_Design.ATM_Machine.State.AtmState;
import LLD_Sytem_Design.ATM_Machine.State.IdleState;

public class ATM {
    private static ATM atm = new ATM();
    AtmMachine atmMachine = new AtmMachine();

    AtmState currentAtmState;
    private int atmBalance;
    int noOf2kNotes;
    int noOf500Notes;
    int noOf200Notes;

    private ATM(){

    }

    public void setCurrentAtmState(AtmState currentAtmState){
        this.currentAtmState = currentAtmState;
    }

    public AtmState getCurrentAtmState(){
        return currentAtmState;
    }

    public static ATM getAtmObject(){
        atm.setCurrentAtmState(new IdleState());
        return atm;
    }

    public int getAtmBalance(){
        return atmBalance;
    }

    public void setAtmBalance(int atmBalance, int noOf2kNotes, int noOf500Notes, int noOf500Notes){
        this.atmBalance = atmBalance;
        this.noOf2kNotes = noOf2kNotes;
        this.noOf500Notes = noOf500Notes;
        this.noOf200Notes = noOf200Notes;
    }

    public void deductAtmBalance(int amount){
        atmMachine.dispenseCash(amount);
    }

    public static ATM getAtm() {
        return atm;
    }

    public static void setAtm(ATM atm) {
        ATM.atm = atm;
    }

    public void setAtmBalance(int atmBalance) {
        this.atmBalance = atmBalance;
    }

    public int getNoOf2kNotes() {
        return noOf2kNotes;
    }

    public void setNoOf2kNotes(int noOf2kNotes) {
        this.noOf2kNotes = noOf2kNotes;
    }

    public int getNoOf500Notes() {
        return noOf500Notes;
    }

    public void setNoOf500Notes(int noOf500Notes) {
        this.noOf500Notes = noOf500Notes;
    }

    public int getNoOf200Notes() {
        return noOf200Notes;
    }

    public void setNoOf200Notes(int noOf200Notes) {
        this.noOf200Notes = noOf200Notes;
    }
}

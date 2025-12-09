package LLD_Sytem_Design.ATM_Machine;

import LLD_Sytem_Design.ATM_Machine.CashDispenser.AtmMachine;

public class AtmDemo {
    public static void main(String[] args) {
        AtmMachine atmMachine = new AtmMachine();
        atmMachine.dispenseCash(3800);
    }
}

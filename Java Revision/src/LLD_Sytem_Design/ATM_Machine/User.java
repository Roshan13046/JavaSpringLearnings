package LLD_Sytem_Design.ATM_Machine;

import javax.smartcardio.Card;

public class User {

    Card card;
    UserBankAccount bankAccount;

    public Card getCard(){
        return card;
    }

    public void setCard(Card card){
        this.card = card;
    }
}

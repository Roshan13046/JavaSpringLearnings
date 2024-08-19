package SuperClassSubClassObjectClass;

public class Phone {
    String display;
    String keyboard;
    String speakers;

    Phone(){
        display = "smallDisplay";
        keyboard = "buttonKeyBoard";
        speakers = "normalSpeaker";
    }

    Phone(String display, String keyboard, String speakers){
        display = display;
        keyboard = keyboard;
        speakers = speakers;
    }
}

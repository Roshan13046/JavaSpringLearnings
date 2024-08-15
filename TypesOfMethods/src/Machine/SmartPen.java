package Machine;

public class SmartPen extends Pen{
//    @Override //ERROR as static method cannot be overridden
    public static void printPenCompanyBailley(){
        System.out.println("Bailley Smart Pen");
    }

//    Note: final methods cannot be overriden
//    @Override
//    public void printPenName(String penName){
//        System.out.println("Smart Pen Name : " + penName);
//    }
}

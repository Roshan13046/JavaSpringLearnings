package Machine;

public class Pen {
    public static String penCompany = "Bailley";
    public String penName;


    //static method
    public static int getPenPrice(){
        System.out.println("Pen Company : " + penCompany);

//        penName = "Roshan";  Error
        int capPrice = 2, bodyPrice = 3, refillPrice = 5;
        Pen pen = new Pen();
        pen.getPenId();

//        getPenId();  ERROR : cannot access non-static method directly with class instance
        return capPrice + bodyPrice + refillPrice;
    }

    public static void printPenCompanyBailley(){
        System.out.println("Bailley Pen");
    }

    //non static method
    public int getPenId(){
        return 1;
    }

    public String getPenType(){
        return Pen.getPenPrice() > 10 ? "Gel Pen" : "Ball Pen";
    }

    public final void printPenName(String penName){
        System.out.println("Pen name is : " + penName);
    }


    public static void main(String[] args) {
        Pen.getPenPrice();
        Pen pen = new Pen();
//        pen.penCompany ERROR
        System.out.println(pen.getPenPrice()); //Warning but program get compiled successfully
        System.out.println(Pen.getPenPrice());//No waring
    }
}

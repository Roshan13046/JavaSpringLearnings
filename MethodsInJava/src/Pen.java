public class Pen {


    public int getSum(int a, int b){
        return a + b;
    }

    public int getPenPrice(int a, int b){
        int capPrice = a, bodyPrice = b;
        return 2+getSum(capPrice,bodyPrice);
    }

    public static void main(String[] args) {
        Pen pen = new Pen();
        System.out.println("Pen Price : " + pen.getPenPrice(3,7));;
    }
}

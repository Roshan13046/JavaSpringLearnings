package GenericClassAndMethod.genericMethodsOnly;

public class Main {
    public static void main(String[] args) {
        Print print = new Print();
        Pair<String,Integer> pair1 = new Pair<>();
        Pair<String, Integer> pair2 = new Pair<>();

        pair1.setPair("Roshan", 1);
        pair2.setPair("Shubham", 1);

        print.printData(pair1, pair2);




    }
}

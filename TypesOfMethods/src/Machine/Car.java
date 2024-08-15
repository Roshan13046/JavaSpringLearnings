package Machine;

public class Car {

    public static int carPrice = 40;

    public int getSum(int a, int b){
        carPrice = a + b;
        return a + b; //since it's using  instance variable so it should not be declared as static
    }

    public static int getSumOfTwo(int a, int b){
        return a + b;
    }
}

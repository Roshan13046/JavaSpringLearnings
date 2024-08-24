package GenericClasses;

public class Print<T> {
    T value;

    private T getValue(){
        return value;
    }

    public void setValue(T value){
        value = value;
    }

    public void printValue(){
        System.out.println(getValue());
    }

    public static void main(String[] args) {
        Print<Integer> integerPrint = new Print<>();
        integerPrint.setValue(24);
        integerPrint.printValue();
    }

}

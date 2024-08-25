package GenericClasses;

public class Print<T > {
    T value;

    Print(){
        value = null;
    }

    Print(T value){
        value = value;
    }
    public T getValue(){
        return value;
    }

    public void setValue(T value){
        value = value;
    }

    public void printValue(T value){
        System.out.println(value);
    }


    public static void main(String[] args) {
        Print<Integer> integerPrint = new Print<>();
        integerPrint.setValue(24);
        integerPrint.printValue(integerPrint.getValue());
    }

}

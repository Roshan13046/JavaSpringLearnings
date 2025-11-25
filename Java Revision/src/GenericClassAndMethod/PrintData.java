package GenericClassAndMethod;

public class PrintData <T>{

    T value;

    public T getValue(){
        return value;
    }

    public void setPrintValue(T value){
        this.value = value;
    }

    public void printData(T value){
        System.out.println("Data : " + value);
    }
}

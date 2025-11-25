package GenericClassAndMethod.boundedGenerics;

public class Print <T extends Number>{

    public void printData(T val){
        System.out.println("PrintData : "+ val);
    }
}

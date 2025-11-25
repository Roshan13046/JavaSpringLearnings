package GenericClassAndMethod.boundedGenerics;

public class
PrintBoundNuInterface <T extends NumInterface>{

    public void printData(T data){
        System.out.println(data);
    }
}

package GenericClasses;

public class Scanner <T extends Number >{

    T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void scanData(T data){
        System.out.println(data);
    }

    public void main(String[] args) {
       Scanner scanner = new Scanner();
       scanner.scanData(1234.56);
//       scanner.scanData("String"); //Not valid bcz it's bounded to Number class only
       scanner.scanData(34L);
       scanner.scanData(12222);

    }
}

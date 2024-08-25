package GenericClasses;

public class Vehicle {
    String no;
    String seater;

    public Vehicle(){
        this.no = null;
        this.seater = null;
    }

    public Vehicle(String no, String seater) {
        this.no = no;
        this.seater = seater;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getSeater() {
        return seater;
    }

    public void setSeater(String seater) {
        this.seater = seater;
    }
}
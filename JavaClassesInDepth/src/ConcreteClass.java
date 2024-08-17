public class ConcreteClass {
    int id;

    ConcreteClass(int id){
        id = id;
    }

    ConcreteClass(){
        id = 0;
    }

    public int getId(){
        return id;
    }

    public static void main(String[] args) {
        ConcreteClass concreteClass = new ConcreteClass(1);
        ConcreteClass concreteClass2 = new ConcreteClass();
    }
}

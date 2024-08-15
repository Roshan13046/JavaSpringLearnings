package chainingUsingSUper;

public class Machine {
    int id;

    Machine(){
        id = 0;
    }

    Machine(int id ){
        this.id = id;
        System.out.println("Machine constructor is called");
    }
}

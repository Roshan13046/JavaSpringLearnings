package ReflectionOfMethods;

public class Animal {

    public String breed;
    private String name;
    protected String age;

    public void canEat(){
        System.out.println("Can Eat");
    }

    private void canMove(){
        System.out.println("Can Move");
    }

    protected void getLifeSpan(){
        System.out.println("Max 20 years");
    }


}

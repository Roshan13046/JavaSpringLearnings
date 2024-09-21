package ReflectionOfMethods;

public class Animal {

    public String breed;
    private String name;
    protected String age;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

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

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try{
            //getting the object of the class for getting the metadata information of the bird class
            //way 1 using Class.formName()
            Class birdClass = Class.forName("Bird");
            //way 2 using .class
            Class birdClass2 = Bird.class;
            //way 3 using .getClass()
            Bird birdObj = new Bird();
            Class birdClass3 = birdObj.getClass();

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
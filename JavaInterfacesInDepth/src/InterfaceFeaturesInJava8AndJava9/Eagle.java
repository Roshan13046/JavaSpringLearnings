package InterfaceFeaturesInJava8AndJava9;

public class Eagle implements Bird{
    @Override
    public void canFly() {
        System.out.println("Eagles can Fly High");
    }

    @Override
    public void minHeightOfFly() {
        System.out.println("190 ft's min fly height");
    }

    public void hasDigestiveSystem(){
        if(LivingThing.canEat()){
            System.out.println("Eagle has Digestive system");
        }else{
            System.out.println("Eagle don't have any Digestive system");
        }
    }

    public void hasAge(){
        if(LivingThing.checkIfCanGrow()){
            System.out.println("Has Limited Age Life");
        }else{
            System.out.println("Alive for Limitless span");
        }

    }


}

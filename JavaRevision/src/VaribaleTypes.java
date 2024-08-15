public class VaribaleTypes {

    public static int classVariable = 10; //class or static variable

    private int memberVariable; // member/instance variable created for each instance

    VaribaleTypes(int memberVariable){//constructor variable
        this.memberVariable = memberVariable;
    }

    public int giveSum(int a, int b){//parameter variables
        int sum = a + b; //local variable
        return sum;
    }

    public static void main(String[] args) {
        VaribaleTypes varibaleTypes = new VaribaleTypes(10);
        System.out.println("Sum : "+varibaleTypes.giveSum(1,5));

        //accessing the static variables
        System.out.println("staitc vairbales: "+ VaribaleTypes.classVariable);

    }
}


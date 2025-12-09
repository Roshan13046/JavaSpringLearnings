package LLD_Sytem_Design.CompositeDesignPattern.ArithmaticExpression;

public class Main {
    public static void main(String[] args) {
        ArithmeticExpression five = new Number(5);
        ArithmeticExpression eight = new Number(8);
        ArithmeticExpression three = new Number(3);

        ArithmeticExpression addExpression = new Expression(five, eight, Operation.ADD);

        ArithmeticExpression parentExpression = new Expression(three, addExpression, Operation.MUL);

        System.out.println(parentExpression.evaluate());
    }
}

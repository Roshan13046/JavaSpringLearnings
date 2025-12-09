package LLD_Sytem_Design.CompositeDesignPattern.ArithmaticExpression;



public class Expression implements ArithmeticExpression{
    ArithmeticExpression leftExpression;
    ArithmeticExpression rightExpression;
    Operation operation;

    public Expression(ArithmeticExpression leftExpression, ArithmeticExpression rightExpression, Operation operation) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }

    @Override
    public int evaluate() {
        int value = 0;
        switch (operation){
            case ADD:
                value = leftExpression.evaluate() + rightExpression.evaluate();
                break;
            case SUB:
                value = leftExpression.evaluate() - rightExpression.evaluate();
                break;
            case DIV:
                value = leftExpression.evaluate() / rightExpression.evaluate();
                break;
            case MUL:
                value = leftExpression.evaluate() * rightExpression.evaluate();
                break;

        }

        System.out.println("Expression value is :" + value);
        return  value;
    }
}

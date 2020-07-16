

public class Division extends BinaryOperator {
    public Division(ArithmeticExpression operandEsquerra, ArithmeticExpression operandDret) {
        super(operandEsquerra, operandDret);
    }

    @Override
    public double calculate() {
        return getLeft().calculate() / getRight().calculate();
    }

}



public class Subtract extends BinaryOperator {
    public Subtract(ArithmeticExpression operandEsquerra, ArithmeticExpression operandDret) {
        super(operandEsquerra, operandDret);
    }

    @Override
    public double calculate() {
        return getLeft().calculate() - getRight().calculate();
    }

}

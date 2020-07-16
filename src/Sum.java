

public class Sum extends BinaryOperator {
    public Sum(ArithmeticExpression operandEsquerra, ArithmeticExpression operandDret) {
        super(operandEsquerra, operandDret);
    }

    @Override
    public double calculate() {
        return getLeft().calculate() + getRight().calculate();
    }

}

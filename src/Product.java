

public class Product extends BinaryOperator {
    public Product(ArithmeticExpression operandEsquerra, ArithmeticExpression operandDret) {
        super(operandEsquerra, operandDret);
    }

    @Override
    public double calculate() {
        return getLeft().calculate() * getRight().calculate();
    }

    @Override
    public void prettyPrint() {
        System.out.print("(");
        getLeft().prettyPrint();
        System.out.print(")");
        System.out.print(" * ");
        System.out.print("(");
        getRight().prettyPrint();
        System.out.print(")");
    }

}

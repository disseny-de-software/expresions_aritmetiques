public class Constant implements ArithmeticExpression {
    private double valor;
    
    public Constant(double val) {
        valor = val;
    }
    
    @Override
    public double calculate() {
        return valor;
    }

}

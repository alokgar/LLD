public class Expression implements ArithmeticExpression {
    ArithmeticExpression leftExpr;
    ArithmeticExpression rightExpr;
    Character operation;
    public Expression(ArithmeticExpression leftExpr,
                      ArithmeticExpression rightExpr,
                      Character operation){
        this.leftExpr = leftExpr;
        this.rightExpr = rightExpr;
        this.operation = operation;
    }

    @Override
    public int evaluate() {
        switch (operation){
            case '+' :
               return leftExpr.evaluate() + rightExpr.evaluate();
            case '-' :
                return leftExpr.evaluate() - rightExpr.evaluate();
            case '*' :
                return leftExpr.evaluate() * rightExpr.evaluate();
            case '/' :
                return leftExpr.evaluate() / rightExpr.evaluate();

            default:
                return 0;
        }
    }
}

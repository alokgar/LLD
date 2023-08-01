public class Main {
    // using composite pattern here
    public static void main(String[] args) {
        ArithmeticExpression two = new Number(2);
        ArithmeticExpression one = new Number(1);
        ArithmeticExpression seven = new Number(7);
        ArithmeticExpression onePlusSeven = new Expression(one, seven, '+');
        ArithmeticExpression twoIntoOnePlusSeven = new Expression(two, onePlusSeven, '*');
        System.out.println(twoIntoOnePlusSeven.evaluate());
    }
}
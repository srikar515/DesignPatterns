package StrategyPattern;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        ShoppingCart sc = new ShoppingCart(new CashPaymentStrategy());
        sc.checkOut(500);

        ShoppingCart sc1 = new ShoppingCart(new CreditCardPaymentStrategy(123,12,"srikar"));
        sc1.checkOut(200);
    }
}

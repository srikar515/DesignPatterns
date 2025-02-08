package StrategyPattern;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    ShoppingCart(PaymentStrategy obj){
        this.paymentStrategy = obj;
    }

    public void checkOut(int amount){
        paymentStrategy.pay(amount);
    }
}

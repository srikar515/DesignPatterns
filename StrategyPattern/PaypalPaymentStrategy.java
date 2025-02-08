package StrategyPattern;

public class PaypalPaymentStrategy implements PaymentStrategy{
    String email;
    String password;

    PaypalPaymentStrategy(String email, String password){
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount){
        System.out.println("Payed with paypal account");
    }
}

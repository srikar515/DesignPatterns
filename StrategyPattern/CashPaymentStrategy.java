package StrategyPattern;

public class CashPaymentStrategy implements PaymentStrategy {
    public CashPaymentStrategy(){
        
    }
    @Override
    public void pay(int amount){
        System.out.println("Payed with cash");
    }
}

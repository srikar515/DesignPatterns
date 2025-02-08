package StrategyPattern;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    int accountNumber;
    int cvv;
    String name;

    public CreditCardPaymentStrategy(int accountNumber, int cvv, String name){
        this.accountNumber = accountNumber;
        this.cvv = cvv;
        this.name = name;
    }

    @Override
    public void pay(int amount){
        System.out.println("Paying "+ name + "with "+accountNumber);
    }
}

import Payment.PaymentMethod;

public class Payment {
    PaymentMethod provider; 
    double amount;
    Payment(PaymentMethod p, double a){ 
        provider=p; 
        amount=a; 
    }

    public void payment(){
        provider.pay(amount);
    }
}
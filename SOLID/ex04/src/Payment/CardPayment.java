package Payment;

public class CardPayment implements PaymentMethod{
    public void pay(double amount){
        System.out.println("Charged card: " + amount);
    }
}

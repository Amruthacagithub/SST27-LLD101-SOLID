package Payment;

public class UPIPayment implements PaymentMethod{
    public void pay(double amount){
        System.out.println("Paid via UPI: " + amount);
    }
}

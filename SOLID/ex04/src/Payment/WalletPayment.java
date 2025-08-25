package Payment;

public class WalletPayment implements PaymentMethod{
    public void pay(double amount){
        System.out.println("Wallet debit: " + amount);
    }
}

import Payment.CardPayment;
import Payment.PaymentMethod;
import Payment.UPIPayment;

public class Demo04 {
    public static void main(String[] args) {
        PaymentMethod upi = new UPIPayment();
        upi.pay(499.0);
        // System.out.println(upi.pay(499.0));
    }
}

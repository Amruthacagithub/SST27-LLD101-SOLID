import NotificationService.EmailClient;
import Order.DBorderStore;
import Tax.TaxCalculator;

public class Demo01 {
    public static void main(String[] args) {
        EmailClient email = new EmailClient();
        TaxCalculator taxCalculator = new TaxCalculator();
        DBorderStore dbStore = new DBorderStore();

        OrderService orderService = new OrderService(email, taxCalculator, dbStore);
        orderService.checkout("a@shop.com", 100.0);
    }
}

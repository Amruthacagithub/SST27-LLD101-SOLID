import NotificationService.Notification;
import Order.orderRepo;
import Tax.TaxCalculator;


public class OrderService {
    private Notification notification;
    private TaxCalculator taxCalculator;
    private orderRepo orderRepo;

    public OrderService(Notification notification, TaxCalculator taxCalculator, orderRepo orderRepo){
        this.notification = notification;
        this.taxCalculator = taxCalculator;
        this.orderRepo = orderRepo;
    }

    void checkout(String customerEmail, double subtotal) {
        double total = taxCalculator.totalWithTax(subtotal);
        notification.send(customerEmail, "Thanks! Your total is " + total);
        orderRepo.storeOrder();
    }
}


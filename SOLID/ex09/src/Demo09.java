import Order.OrderController;
import Order.Order_Repo;
import Order.SqlOrderRepository;

public class Demo09 {
    public static void main(String[] args) {
        Order_Repo sql = new SqlOrderRepository();
        OrderController controller = new OrderController(sql);
        controller.create("ORD-1");
    }
}

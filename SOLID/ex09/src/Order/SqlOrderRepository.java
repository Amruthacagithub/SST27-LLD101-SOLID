package Order;

public class SqlOrderRepository implements Order_Repo {
    @Override
    public void save(String id) {
        System.out.println("Saved order " + id + " to SQL");
    }
}

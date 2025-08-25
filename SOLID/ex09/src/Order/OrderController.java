package Order;

public class OrderController {
    private Order_Repo repo;
    public OrderController(Order_Repo repo){
        this.repo = repo;
    }
    public void create(String id){
        repo.save(id);
        System.out.println("Created order: " + id);
    }
}

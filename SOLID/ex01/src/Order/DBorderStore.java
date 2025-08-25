package Order;

public class DBorderStore implements orderRepo{
    @Override
    public void storeOrder(){
        System.out.println("Order stored (pretend DB).");
    }
}

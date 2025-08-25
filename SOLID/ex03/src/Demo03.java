import Shipping.ExpressShipping;
import Shipping.ShippingMethod;

public class Demo03 {
    public static void main(String[] args) {
        ShippingMethod express = new ExpressShipping();
        System.out.println(express.costCalculator(2.0));
    }
}

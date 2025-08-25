package Shipping;
public class ExpressShipping implements ShippingMethod {
    public double costCalculator(double weightKg){
        return 80 + 8 *weightKg;
    }
    
}

package Shipping;
public class OvernightShipping implements ShippingMethod{
    public double costCalculator(double weightKg){
        return 120 + 10 * weightKg;
    }
    
}

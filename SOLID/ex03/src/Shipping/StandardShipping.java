package Shipping;
public class StandardShipping implements ShippingMethod{
    public double costCalculator(double weightKg){
        return 50 + 5 * weightKg;
    }
}

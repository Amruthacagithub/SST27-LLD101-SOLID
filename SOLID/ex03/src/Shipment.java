import Shipping.ShippingMethod;

public class Shipment {
    ShippingMethod type;
    double weightKg;
    Shipment(ShippingMethod type, double w){ 
        this.type=type; 
        this.weightKg=w; 
    }
    public double shippingCalculator(){
        return type.costCalculator(weightKg);
    }
}
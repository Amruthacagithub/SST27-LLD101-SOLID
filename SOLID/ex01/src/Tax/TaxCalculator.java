package Tax;

public class TaxCalculator extends TaxRate{
    private TaxRate taxRate;
    public TaxCalculator(){
        this.taxRate = new TaxRate();
    }

    public double totalWithTax(double subtotal) {
        return subtotal + subtotal * taxRate.getTaxRate();
    }
}

// logic to calculate tax 
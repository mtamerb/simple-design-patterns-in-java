package interfaces;

public class TaxCalculator2022 implements TaxCalculator {
    @Override
    public double calculateTax() {
        return 2;
    }

    // not impact the main class
    public double calculateInsurance() {
        return 3;
    }
}

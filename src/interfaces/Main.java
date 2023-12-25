package interfaces;

public class Main {

    public static void main(String[] args) {
        TaxCalculator calculator = getCalculator();
        System.out.println("tax: " + calculator.calculateTax()); // loose coupling
    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2023();
    }
}

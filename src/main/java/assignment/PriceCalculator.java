/*
 *13. A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount? [Extract the digits from the paragraph and calculate the price]
 */
package assignment;

public class PriceCalculator {

    public static void main(String[] args) {
        // Prices extracted
        int laptopPrice = 85000;
        int mousePrice = 2500;
        double discountPercent = 15.0;

        // Calculate total cost before discount
        int total = laptopPrice + mousePrice;

        // Calculate discount amount
        double discountAmount = (discountPercent / 100) * total;

        // Final price after discount
        double finalPrice = total - discountAmount;
        System.out.println("Total cost after 15% discount: " + finalPrice + " Tk");
    }
}

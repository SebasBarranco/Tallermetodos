
public class Exercise1 {

    public static double calculatePriceWithDiscount(double price, double discount) {
        double priceWithDiscount = price - (price * (discount / 100));
        return priceWithDiscount;
    }
}

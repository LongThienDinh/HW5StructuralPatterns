public class LoyaltyStatus {
    private double discount;

    public LoyaltyStatus(double discount) {
        this.discount = discount;
    }

    public double addDiscount(double totalPrice) {
        return totalPrice * (1 - discount) ;
    }
}
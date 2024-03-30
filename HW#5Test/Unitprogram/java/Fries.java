public class Fries implements FoodItems {
    private double price;

    public Fries(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
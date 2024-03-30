public class Burger implements FoodItems {
    private double price;

    public Burger(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
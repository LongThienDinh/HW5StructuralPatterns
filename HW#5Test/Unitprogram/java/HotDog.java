public class HotDog implements FoodItems {
    private double price;

    public HotDog(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
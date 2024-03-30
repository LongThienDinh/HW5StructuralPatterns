public class Onion extends Toppings {
    private double price;

    public Onion(FoodItems foodItem, double price) {
        super(foodItem);
        this.price = price;
    }

    @Override
    public double getPrice() {
        return foodItem.getPrice() + this.price;
    }
}
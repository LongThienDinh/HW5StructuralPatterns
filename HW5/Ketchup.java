public class Ketchup extends Toppings {
    private double price;

    public Ketchup(FoodItems foodItem, double price) {
        super(foodItem);
        this.price = price;
    }

    @Override
    public double getPrice() {
        return foodItem.getPrice() + this.price;
    }
}
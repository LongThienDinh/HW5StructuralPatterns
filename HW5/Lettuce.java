public class Lettuce extends Toppings {
    private double price;

    public Lettuce(FoodItems foodItem, double price) {
        super(foodItem);
        this.price = price;
    }

    @Override
    public double getPrice() {
        return foodItem.getPrice() + this.price;
    }
}
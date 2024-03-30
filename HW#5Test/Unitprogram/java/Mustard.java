public class Mustard extends Toppings {
    private double price;

    public Mustard(FoodItems foodItem, double price) {
        super(foodItem);
        this.price = price;
    }

    @Override
    public double getPrice() {
        return foodItem.getPrice() + this.price;
    }
}
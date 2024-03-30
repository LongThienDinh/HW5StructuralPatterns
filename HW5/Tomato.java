public class Tomato extends Toppings {
    private double price;

    public Tomato(FoodItems foodItem, double price) {
        super(foodItem);
        this.price = price;
    }

    @Override
    public double getPrice() {
        return foodItem.getPrice() + this.price;
    }
}
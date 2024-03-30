
public abstract class Toppings implements FoodItems {
    protected FoodItems foodItem;

    public Toppings(FoodItems foodItem) {
        this.foodItem = foodItem;
    }
}

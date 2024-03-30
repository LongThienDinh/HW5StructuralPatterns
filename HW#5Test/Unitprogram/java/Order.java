import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<FoodItems> foodItems = new ArrayList<>();

    public void addFoodItems(FoodItems foodItem) {
        foodItems.add(foodItem);
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (FoodItems foodItem : foodItems) {
            totalPrice += foodItem.getPrice();
        }
        return totalPrice;
    }
}
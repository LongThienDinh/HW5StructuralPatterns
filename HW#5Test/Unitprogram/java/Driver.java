public class Driver {
    public static void main(String[] args) {
        FoodItems burger = new Burger(5.50); 
        FoodItems fries = new Fries(2.75); 
        FoodItems hotDog = new HotDog(4.25);

        FoodItems burgerPlusTomato = new Tomato(burger, 0.75); 
        FoodItems burgerPlusTomatoAndOnion = new Onion(burgerPlusTomato, 0.50); 

        FoodItems friesPlusKetchup = new Ketchup(fries, 0.20); 
        FoodItems friesPlusKetchupAndMustard = new Mustard(friesPlusKetchup, 0.25); 

        FoodItems hotDogPlusLettuce = new Lettuce(hotDog, 0.30); 
        FoodItems hotDogPlusLettuceAndMustard = new Mustard(hotDogPlusLettuce, 0.40); 

        Order Order = new Order();
        Order.addFoodItems(burgerPlusTomatoAndOnion);
        Order.addFoodItems(friesPlusKetchupAndMustard);
        Order.addFoodItems(hotDogPlusLettuceAndMustard);

        double totalCost = Order.getTotalPrice();
        System.out.print("+ Total Price: ");
        System.out.println(String.format("%.2f$", totalCost));

        LoyaltyStatus loyaltyStatus = new LoyaltyStatus(0.15); 
        double finalCost = loyaltyStatus.addDiscount(totalCost);
        System.out.print("+ Final Price after discount: ");
        System.out.println(String.format("%.2f$", finalCost));
    }
}

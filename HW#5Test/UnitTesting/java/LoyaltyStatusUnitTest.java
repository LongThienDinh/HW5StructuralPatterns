import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoyaltyStatusUnitTest {

    @Test
    public void UnitTesting() {
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus(.15);
        double totalPrice = 25.0;
        double FinalPrice = 21.25;

        double CalculatedPrice = loyaltyStatus.addDiscount(totalPrice);

        Assertions.assertEquals(FinalPrice, CalculatedPrice,
                "The discounted price is incorrect.");
    }
}
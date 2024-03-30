import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotDogUnitTest {
    @Test
    public void UnitTesting() {
        HotDog Hotdog = new HotDog(2.5);
        Assertions.assertEquals(2.5, Hotdog.getPrice() ,"The price of Hotdog is incorrect.");
    }
}

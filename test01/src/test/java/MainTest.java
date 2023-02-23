import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import cz.cvut.fel.ts1.Main;
public class MainTest {
    @Test
    public void factorialTest() {
        Assertions.assertEquals(2, Main.factorialRecursive(2));
        Assertions.assertEquals(120, Main.factorialRecursive(5));
    }
}

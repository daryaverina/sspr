import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyTestClass {

    @Test
    public void testAddition() {
        int result = 2 + 2;
        assertEquals(4, result, "2 + 2 should equal 4");
    }
}
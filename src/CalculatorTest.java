import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void oneplusoneequalstwp(){
        Calculator calculator = new Calculator();
        assertEquals(calculator.calculate_add(1, 1),2);
    }

}

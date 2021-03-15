import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(500, waterBottle.getVolume());
    }

    @Test
    public void canDrink(){
        waterBottle.drinkWater();
        assertEquals(450, waterBottle.getVolume());
    }

    @Test
    public void canEmpty(){
        waterBottle.emptyBottle();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void canFill() {
        waterBottle.drinkWater();
        assertEquals(450, waterBottle.getVolume());

        waterBottle.fillUp();
        assertEquals(500, waterBottle.getVolume());
    }
}
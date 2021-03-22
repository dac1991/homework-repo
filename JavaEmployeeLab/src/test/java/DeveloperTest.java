import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Vladimir", 1991, 28500);
    }

    @Test
    public void canGetName(){
        assertEquals("Vladimir", developer.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals(1991, developer.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(28500, developer.getSalary());
    }

    @Test
    public void canIncreaseSalary(){
        developer.raiseSalary(1500);
        assertEquals(30000, developer.getSalary());
    }

    @Test
    public void canGetBonus(){
        assertEquals(285, developer.payBonus(), 0);
    }
}
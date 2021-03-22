import Staff.Management.Director;
import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Elon", 1888, 500000, "Technoking", 20000);
    }

    @Test
    public void canGetDirectorName(){
        assertEquals("Elon", director.getName());
    }

    @Test
    public void canGetDirectorNINumber(){
        assertEquals(1888, director.getNINumber());
    }

    @Test
    public void canGetDirectorSalary(){
        assertEquals(500000, director.getSalary());
    }

    @Test
    public void canGetDepartmentName(){
        assertEquals("Technoking", director.getDeptName());
    }

    @Test
    public void canIncreaseDirectorSalary(){
        director.raiseSalary(100000);
        assertEquals(600000, director.getSalary());
    }

    @Test
    public void canGetDirectorBonus(){

        assertEquals(10000, director.payBonus(), 0);
    }


}

import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Michael Scott", 10, 40000, "Office Supplies");
    }

    @Test
    public void canGetManagerName(){
        assertEquals("Michael Scott", manager.getName());
    }

    @Test
    public void canGetManagerNINumber(){
        assertEquals(10, manager.getNINumber());
    }

    @Test
    public void canGetManagerSalary(){
        assertEquals(40000, manager.getSalary());
    }

    @Test
    public void canGetDepartmentName(){
        assertEquals("Office Supplies", manager.getDeptName());
    }

    @Test
    public void canIncreaseManagerSalary(){
        manager.raiseSalary(2000);
        assertEquals(42000, manager.getSalary());
    }

    @Test
    public void canGetManagerBonus(){

        assertEquals(400, manager.payBonus(), 0);
    }

    @Test
    public void canChangeManagerName(){
        manager.changeName("Andy Bernard");
        assertEquals("Andy Bernard", manager.getName());
    }
}
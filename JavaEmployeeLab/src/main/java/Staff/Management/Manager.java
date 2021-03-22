package Staff.Management;

import Staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, int NINumber, int salary, String deptName) {
        super(name, NINumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

}
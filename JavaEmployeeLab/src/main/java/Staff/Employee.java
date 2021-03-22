package Staff;

public abstract class Employee {

    private String name;
    private int NINumber;
    private int salary;

    public Employee(String name, int NINumber, int salary) {
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getNINumber() {
        return NINumber;
    }

    public int getSalary() {
        return salary;
    }

    public void raiseSalary(double raiseAmount){
        if (raiseAmount > 0) {
            this.salary += raiseAmount;
        }
    }

    public double payBonus(){
        return (this.salary * 0.01);
    }

    public void changeName(String newName){
        if (newName != null) {
            this.name = newName;
        }
    }
}
package Staff.Management;

public class Director extends Staff.Management.Manager {

    private int budget;

    public Director(String name, int NINumber, int salary, String deptName, int budget) {
        super(name, NINumber, salary, deptName);
        this.budget = budget;
    }

    public int getBudget() {
        return budget;
    }

    @Override
    public double payBonus() {
        return super.payBonus() * 2;
    }
}
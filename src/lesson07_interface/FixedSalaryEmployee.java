package lesson07_interface;

public class FixedSalaryEmployee implements Salary {
    int salary;

    public FixedSalaryEmployee(int salary) {
        this.salary = salary;
    }

    public int salary() {
        return this.salary;
    }
}

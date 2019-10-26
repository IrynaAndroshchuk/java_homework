package lesson07_interface.Task1;

public class FixedSalaryEmployee implements Salary {
    int salary;

    public FixedSalaryEmployee(int salary) {
        this.salary = salary;
    }

    public int salary() {
        return this.salary;
    }
}

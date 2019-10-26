package lesson07_interface.Task1;

public class HourlySalaryEmployee implements Salary {
    int rate;

    public HourlySalaryEmployee(int rate) {
        this.rate = rate;
    }

    public int salary() {
        return this.rate*250;
    }
}

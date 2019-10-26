package lesson07_interface;

public class Lesson07Task1 {
    public static void main(String[] args) {
        FixedSalaryEmployee fixedSalaryEmployee = new FixedSalaryEmployee(25000);
        HourlySalaryEmployee hourlySalaryEmployee = new HourlySalaryEmployee(150);

        System.out.println("First employee earns " + fixedSalaryEmployee.salary());
        System.out.println("Second employee earns " + hourlySalaryEmployee.salary());
    }
}
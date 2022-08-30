import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Domenico", "Celani", 32,165, true,
                LocalDate.of(2020, 10, 23), true, 12345, "3333333", EmployeeRolesEnum.CASHIER);
        System.out.println(employee.salaryCalculator(employee));

    }
}
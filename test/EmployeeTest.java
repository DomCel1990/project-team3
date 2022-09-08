import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void calculatorSalary() {
        Employee e = new Employee("Fabio", "Serdi", 32,
                179, true,
                LocalDate.of(2000, 10, 23),
                true, 12344, "33444", EmployeeRole.MANAGER);
        Assertions.assertEquals(2209.0, e.calculatorSalary(), 0.001);
    }


    @Test
    void hasPermission() {
        Employee e = new Employee("Fabio", "Serdi", 32,
                179, true,
                LocalDate.of(2000, 10, 23),
                true, 12344, "33444", EmployeeRole.CASHIER);

        Assertions.assertTrue(e.hasPermission(Permission.SELL));

    }

   @Test
    public void stopJob() {
        Employee e = new Employee("Domenico", "Celani", 32,
                179, true,
                LocalDate.of(2010, 10, 23),
                true, 12344, "33444", EmployeeRole.MANAGER);

        Assertions.assertTrue(e.stopJob()==25355.15414240625);
    }
}
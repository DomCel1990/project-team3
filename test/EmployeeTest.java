import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import staff.Employee;
import staff.EmployeeRole;
import staff.Permission;

import java.time.LocalDate;

class EmployeeTest {

    @Test
    void calculateBasicSalary_verifyCorrectValue() {
        Employee e = new Employee("Fabio", "Serdi", 32,
                179, true,
                LocalDate.of(2000, 10, 23),
                true, 12344, "33444", EmployeeRole.MANAGER);

        Assertions.assertEquals(1500.0, e.calculateBasicSalary(), 0.0);
    }

    @Test
    void calculateExtraordinarySalary_verifyCorrectValue() {
        Employee e = new Employee("Fabio", "Serdi", 32,
                179, true,
                LocalDate.of(2000, 10, 23),
                true, 12344, "33444", EmployeeRole.MANAGER);

        Assertions.assertEquals(209.0, e.calculateExtraordinarySalary(), 0.0);
    }

    @Test
    void calculateSenioritySalary_verifyCorrectValue() {
        Employee e = new Employee("Fabio", "Serdi", 32,
                179, true,
                LocalDate.of(2010, 10, 23),
                true, 12344, "33444", EmployeeRole.MANAGER);

        Assertions.assertEquals(200.0, e.calculateSenioritySalary(), 0.0);
    }

    @Test
    void hasCheckFamily_verifyCorrectValue_whenIsTrue() {
        Employee e = new Employee("Fabio", "Serdi", 32,
                179, true,
                LocalDate.of(2010, 10, 23),
                true, 12344, "33444", EmployeeRole.MANAGER);

        Assertions.assertEquals(200.0, e.hasCheckFamily(), 0.0);

    }

    @Test
    void hasCheckFamily_verifyCorrectValue_whenIsFalse() {
        Employee e = new Employee("Fabio", "Serdi", 32,
                179, false,
                LocalDate.of(2010, 10, 23),
                true, 12344, "33444", EmployeeRole.MANAGER);

        Assertions.assertEquals(0.0, e.hasCheckFamily(), 0.0);

    }

    @Test
    void calculatorSalary_checkCorrectSalary() {
        Employee e = new Employee("Fabio", "Serdi", 32,
                179, true,
                LocalDate.of(2000, 10, 23),
                true, 12344, "33444", EmployeeRole.MANAGER);

        Assertions.assertEquals(2209.0, e.calculatorSalary(), 0.001);
    }

    @Test
    void hasPermission_verifyIsTrue() {
        Employee e = new Employee("Fabio", "Serdi", 32,
                179, true,
                LocalDate.of(2000, 10, 23),
                true, 12344, "33444", EmployeeRole.CASHIER);

        Assertions.assertTrue(e.hasPermission(Permission.SELL));

    }

    @Test
    void calculateTfr_verifyCorrectValue() {
        Employee e = new Employee("Domenico", "Celani", 32,
                179, true,
                LocalDate.of(2010, 10, 23),
                true, 12344, "33444", EmployeeRole.MANAGER);

        Assertions.assertEquals(25355.0, e.calculateTfr(), 0.2);
    }
}
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class EmployeeTest {

    @Test
    public void calculatorSalary() {
        Employee e = new Employee("Fabio", "Serdi", 32,
                179, true,
                LocalDate.of(2000, 10, 23),
                true, 12344, "33444", EmployeeRole.MANAGER);

        Assert.assertFalse(e.calculatorSalary() == 29);
        Assert.assertTrue(e.calculatorSalary() == 2209.0);
    }

    @Test
    public void hasPermission() {
        Employee e = new Employee("Fabio", "Serdi", 32,
                179, true,
                LocalDate.of(2000, 10, 23),
                true, 12344, "33444", EmployeeRole.CASHIER);

        Assert.assertTrue(e.hasPermission(Permission.SELL));
        Assert.assertFalse(e.hasPermission(Permission.MANAGE_EMPLOYEE));
        Assert.assertFalse(e.hasPermission(Permission.MANAGE_STORE));
        Assert.assertFalse(e.hasPermission(Permission.ADMIN));
    }

}

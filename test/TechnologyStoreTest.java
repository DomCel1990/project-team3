import org.junit.jupiter.api.Assertions;
import product.TechnologyProducts;
import staff.Employee;
import staff.EmployeeRole;
import workshops.TechnologyStore;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class TechnologyStoreTest {

    @org.junit.jupiter.api.Test
    void outputCalculation_VerifyIfPositive() {
        List<TechnologyProducts> products = new ArrayList<>();
        products.add(0, new TechnologyProducts( 15, 20));
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(0, new Employee(179, true, LocalDate.of(2010,10,23), EmployeeRole.MANAGER));
        TechnologyStore store = new TechnologyStore(employeeList, products);

        Assertions.assertEquals(true, store.outputCalculation() > 0);
    }

    @org.junit.jupiter.api.Test
    void outputCalculation_VerifyIfNegative() {
        List<TechnologyProducts> products = new ArrayList<>();
        products.add(0, new TechnologyProducts(21, 210000));
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(0, new Employee(179, true, LocalDate.of(2010,10,23), EmployeeRole.MANAGER));
        TechnologyStore store = new TechnologyStore(employeeList, products);

        Assertions.assertEquals(false, store.outputCalculation() < 0);
    }
}
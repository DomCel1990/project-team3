
public enum EmployeeRoles {
    OWNER(0.0),
    CEO(2000.0),
    MANAGER(1500.0),
    DEPARTMENTHEAD(900.0),
    SALESCLERK(500.0),
    WAREHOUSEWORKER1(800.0),
    CASHIER(800.0)
    ;
    private final double salaryBasic;

    EmployeeRoles(double salaryBasic){
        this.salaryBasic=salaryBasic;
    }
}

import java.util.List;

public enum EmployeeRole {
    OWNER(0.0,0, List.of(Permission.ADMIN, Permission.MANAGE_EMPLOYEE, Permission.MANAGE_STORE, Permission.SELL)),
    MANAGER(9.375,160, List.of(Permission.MANAGE_EMPLOYEE, Permission.MANAGE_STORE, Permission.SELL)),
    DEPARTMENTHEAD(5.625,160, List.of(Permission.MANAGE_EMPLOYEE, Permission.SELL)),
    SALESCLERK(3.125,160, List.of(Permission.SELL)),
    WAREHOUSEWORKER1(5,160, List.of(Permission.MANAGE_STORE)),
    CASHIER(5,160, List.of(Permission.SELL));

    private final double salaryHour;
    private final int hourWork;
    private List<Permission> permissions;

    EmployeeRole(double salaryHour, int hourWork, List<Permission> permissions){
        this.salaryHour = salaryHour;
        this.hourWork = hourWork;
        this.permissions = permissions;
    }

    public boolean hasPermission(Permission permission){
        return permissions.contains(permission);
    }
}

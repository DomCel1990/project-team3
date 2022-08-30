public enum EmployeeRolesEnum {
    OWNER(0.0,0, true, true, true, true),
    MANAGER(9.375,160, true, true, true, true),
    DEPARTMENTHEAD(5.625,160, false, true, true, true),
    SALESCLERK(3.125,160, false, false, false, true),
    WAREHOUSEWORKER1(5,160, false, false, true, false),
    CASHIER(5,160, false, false, false, true);

    private final double salaryHour;
    private final int hourWork;
    //PERMISSIONS
    private final boolean isAdmin;
    private final boolean canManageEmployee;
    private final boolean canManageStore;
    private final boolean canSell;

    EmployeeRolesEnum(double salaryHour, int hourWork, boolean isAdmin, boolean canManageEmployee, boolean canManageStore, boolean canSell){
        this.salaryHour = salaryHour;
        this.hourWork = hourWork;
        this.isAdmin = isAdmin;
        this.canManageEmployee = canManageEmployee;
        this.canManageStore = canManageStore;
        this.canSell = canSell;
    }
}

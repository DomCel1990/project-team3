public enum EmployeeRolesEnum {
    OWNER(0.0,0,0.0, true, true, true, true),
    MANAGER(9.375,160,11, true, true, true, true),
    DEPARTMENTHEAD(5.625,160,7, false, true, true, true),
    SALESCLERK(3.125,160,5, false, false, false, true),
    WAREHOUSEWORKER(5,160, 8,false, false, true, false),
    CASHIER(5,160,8, false, false, false, true);

    private final double salaryHour;
    private final double salaryExtraordinaryHour;
    private final int hourWork;
    //PERMISSIONS
    private final boolean isAdmin;
    private final boolean canManageEmployee;
    private final boolean canManageStore;
    private final boolean canSell;

    EmployeeRolesEnum(double salaryHour, int hourWork, double salaryExtraordinaryHour,  boolean isAdmin, boolean canManageEmployee, boolean canManageStore, boolean canSell){
        this.salaryHour = salaryHour;
        this.hourWork = hourWork;
        this.salaryExtraordinaryHour=salaryExtraordinaryHour;
        this.isAdmin = isAdmin;
        this.canManageEmployee = canManageEmployee;
        this.canManageStore = canManageStore;
        this.canSell = canSell;
    }

    public double getSalaryHour() {
        return salaryHour;
    }

    public int getHourWork() {
        return hourWork;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public boolean isCanManageEmployee() {
        return canManageEmployee;
    }

    public boolean isCanManageStore() {
        return canManageStore;
    }

    public boolean isCanSell() {
        return canSell;
    }

    public double getSalaryExtraordinaryHour() {
        return salaryExtraordinaryHour;
    }
}

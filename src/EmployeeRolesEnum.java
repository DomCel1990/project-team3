public enum EmployeeRolesEnum {
    OWNER(0.0,0),
    MANAGER(9.375,160),
    DEPARTMENTHEAD(5.625,160),
    SALESCLERK(3.125,160),
    WAREHOUSEWORKER1(5,160),
    CASHIER(5,160)
    ;
    private final double salaryHour;
    private final int hourWork;

    EmployeeRolesEnum(double salaryHour, int hourWork){
        this.salaryHour=salaryHour;
        this.hourWork=hourWork;
    }
}

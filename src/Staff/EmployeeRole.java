package staff;

import java.util.List;
import java.util.Random;

public enum EmployeeRole {
    OWNER(0.0,0,0.0, List.of(staff.Permission.ADMIN, staff.Permission.MANAGE_EMPLOYEE, staff.Permission.MANAGE_STORE, staff.Permission.SELL)),
    MANAGER(9.375,160,11, List.of(staff.Permission.MANAGE_EMPLOYEE, staff.Permission.MANAGE_STORE, staff.Permission.SELL)),
    DEPARTMENTHEAD(5.625,160,7, List.of(staff.Permission.MANAGE_EMPLOYEE, staff.Permission.SELL)),
    SALESCLERK(3.125,160,5, List.of(staff.Permission.SELL)),
    WAREHOUSEWORKER(5,160, 8,List.of(staff.Permission.MANAGE_STORE)),
    CASHIER(5,160,8, List.of(staff.Permission.SELL));

    private final double salaryHour;
    private final double salaryExtraordinaryHour;
    private final int hourWork;
    private List<staff.Permission> permissions;

    EmployeeRole(double salaryHour, int hourWork, double salaryExtraordinaryHour, List<staff.Permission> permissions){
        this.salaryHour = salaryHour;
        this.hourWork = hourWork;
        this.salaryExtraordinaryHour=salaryExtraordinaryHour;
        this.permissions = permissions;
    }
        public boolean hasPermission(staff.Permission permission){
        return permissions.contains(permission);
    }



  public double getSalaryHour() {
        return salaryHour;
    }

    public int getHourWork() {
        return hourWork;
    }

    public double getSalaryExtraordinaryHour() {
        return salaryExtraordinaryHour;
    }
    public static EmployeeRole getRandomRoles(){
        Random r = new Random();
        return values()[r.nextInt(values().length)];
    }
}

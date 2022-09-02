import java.time.LocalDate;
import java.util.EnumSet;

public class Employee {

    private String name;
    private String surname;
    private int age;
    private int hoursWorked;
    //si potrebbe pensare di impostarlo come un int ed indicare il numero di figli
    private boolean hasChildren;
    private boolean isMale;
    private int id;
    private LocalDate dateAssumption;

    private String phoneNumber;

    private EmployeeRole roles;
    public Employee(String name, String surname, int age, int hoursWorked, boolean hasChildren, LocalDate dateAssumption, boolean isMale, int id, String phoneNumber,EmployeeRole roles) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isMale = isMale;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.roles = roles;
        this.hasChildren = hasChildren;
        this.dateAssumption = dateAssumption;
        this.hoursWorked = hoursWorked;
    }


    public boolean hasPermission(Permission permission){
        if (roles.hasPermission(permission)){
                return true;
        }
        return false;
    }
    //commento i metodi per non cancellarli definitivamente

/*
    public void addRoles(EmployeeRole e){
        roles.add(e);
    }

    public void removeRoles(EmployeeRole e){
        roles.remove(e);
        */

    // public void addRoles(EmployeeRolesEnum e){
    // roles.add(e);
    // }

    // public void removeRoles(EmployeeRolesEnum e){
    //roles.remove(e);
    //}
    public double calculatorSalary() {
        double salaryBasic = 1;
        double senioritySalary = 0;
        double familyAllowance;
        double salaryExtraordinary = hoursWorked - getRoles().getHourWork();
        switch (getRoles()) {
            case OWNER, MANAGER, CASHIER, SALESCLERK, DEPARTMENTHEAD, WAREHOUSEWORKER -> {
                salaryBasic=getRoles().getSalaryHour()* getRoles().getHourWork();
            }
        }
        //questa parte degli if è da sistemare
        if (LocalDate.now().getYear() - dateAssumption.getYear() <= 5)
            senioritySalary += 0;
        else if (LocalDate.now().getYear() - dateAssumption.getYear() > 5 && LocalDate.now().getYear() - dateAssumption.getYear() <= 10)
            senioritySalary += 100;
        else if (LocalDate.now().getYear() - dateAssumption.getYear() > 10 && LocalDate.now().getYear() - dateAssumption.getYear() <= 15)
            senioritySalary += 200;
        else if (LocalDate.now().getYear() - dateAssumption.getYear() > 15)
            senioritySalary += 300;

        if (hasChildren == true)
            familyAllowance = +200;
        else
            familyAllowance = +0;
        //è da aggiungere unexception nel caso fosse minore di 0
        if (salaryExtraordinary > 0)
            salaryExtraordinary = salaryExtraordinary * getRoles().getSalaryExtraordinaryHour();

        double totalsalary = salaryBasic + senioritySalary + familyAllowance + salaryExtraordinary;
        return totalsalary;


    /*
    public boolean hasPermission(Permission permission){
        for (EmployeeRole role : roles){
            if (role.hasPermission(permission)){
                return true;
            }
        }
        return false;
    

    public boolean hasPermission(Permission permission){
        return roles.stream().anyMatch(employeeRole -> employeeRole.hasPermission(permission));
    }
    */


    }
    public void addEmployee() {
    }

    public void removeEmployee() {
    }

    //GETTER AND SETTER FOR EACH ATTRIBUTE
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
 public EmployeeRole getRoles() {
        return roles;
    }

    public boolean isHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    public LocalDate getDateAssumption() {
        return dateAssumption;
    }

    public void setDateAssumption(LocalDate dateAssumption) {
        this.dateAssumption = dateAssumption;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Surname:" + surname + "\n" +
                "Age:" + age + "\n" +
                "Hours worked: " + hoursWorked + "\n" +
                "Has children: " + hasChildren + "\n" +
                "Is male: " + isMale + "\n" +
                "ID: " + id + "\n" +
                "Date assumption: " + dateAssumption + "\n" +
                "Phone number: " + phoneNumber + "\n" +
                "Roles: " + roles;
    }


}
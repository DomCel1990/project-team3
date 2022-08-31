import java.util.EnumSet;

public class Employee {

    private String name;
    private String surname;
    private int age;
    private boolean isMale;
    private int id;
    private String phoneNumber;
    private EnumSet<EmployeeRole> roles;

    public Employee(String name, String surname, int age, boolean isMale, int id, String phoneNumber,EnumSet<EmployeeRole> roles){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isMale = isMale;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.roles = roles;
    }

    //METHODS
    /*public boolean hasPermission(Permission permission){
        for (EmployeeRole role : roles){
            if (role.hasPermission(permission)){
                return true;
            }
        }
        return false;
    }*/

    public boolean hasPermission(Permission permission){
        return roles.stream().anyMatch(employeeRole -> employeeRole.hasPermission(permission));
    }

    public void addRoles(EmployeeRole e){
        roles.add(e);
    }

    public void removeRoles(EmployeeRole e){
        roles.remove(e);
    }



    public void addEmployee(){
    }

    public void removeEmployee(){
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
    public EnumSet<EmployeeRole> getRoles() {
        return roles;
    }
}
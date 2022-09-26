package workshops;

import staff.Day;
import staff.Employee;

import java.util.List;

public abstract class Shop {

    private String name;
    private String address;
    private String numberToContact;
    private String webSite;
    private List<Employee> employee;
    private Day day;

    public Shop(String name, String address, String numberToContact, String webSite, List<Employee> employee, Day day) {
        this.name = name;
        this.address = address;
        this.numberToContact = numberToContact;
        this.webSite = webSite;
        this.setEmployee(employee);
        this.day = day;
    }

    public abstract double outputCalculation();


    public abstract String averageMarks();

    @Override
    public abstract String toString();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberToContact() {
        return numberToContact;
    }

    public void setNumberToContact(String numberToContact) {
        this.numberToContact = numberToContact;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }


    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }
}

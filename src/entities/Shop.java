package entities;

import entities.Employee;

import java.util.List;

public abstract class Shop {

    private String name;
    private String address;
    private String numberToContact;
    private String webSite;
    private List<Employee> employee;
    private DayEnum day;

    public Shop(String name, String address, String numberToContact, String webSite, List<Employee> employee, DayEnum day) {
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


    public DayEnum getDay() {
        return day;
    }

    public void setDay(DayEnum day) {
        this.day = day;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }
}

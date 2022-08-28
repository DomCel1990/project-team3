import java.util.List;

public class CoffeeShop extends Shop{


    public CoffeeShop(String name, String address, String numberToContact, String webSite, List<Employee> employee, DayEnum day) {
        super(name, address, numberToContact, webSite, employee, day);
    }

    void addEmployee(int i,Employee employee){
        getEmployee().add(i,employee);
    }


    void removeEmployee(int i){
        getEmployee().remove(i);
    }

    @Override
    public String averageMarks() {
        return null;
    }

    @Override
    public String toString() {
        return "CoffeeShop : " + getName() + " " + getEmployee() + " " + getDay() + " " + getNumberToContact();
    }
}

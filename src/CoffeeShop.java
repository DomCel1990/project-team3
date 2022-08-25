import java.util.List;

public class CoffeeShop extends Shop{


    public CoffeeShop(String name, String address, String numberToContact, String webSite, List<Employee> employee, DayEnum day) {
        super(name, address, numberToContact, webSite, employee, day);
    }

    void addEmployee(){
    }

    void removeEmployee(){
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

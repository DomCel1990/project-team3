import java.util.List;

public class Coffe extends Shop{
    public Coffe(String name, String address, String numberToContact, String webSite, List<Employee> employee, DayEnum day) {
        super(name, address, numberToContact, webSite, employee, day);
    }

    @Override
    public String averageMarks() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }
}

import java.util.EnumSet;
import java.util.List;

public class TechnologyStore extends Shop{

  
       private String inventory;
        public TechnologyStore(String name, String address, String inventory, String numberToContact, String webSite, List<Employee> employee, DayEnum day) {
        super(name, address, numberToContact, webSite, employee, day);
        this.inventory = inventory;
    }

    public void addEmployee(int i,Employee employee){
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
        return "TechnologyStore : " + getName() + " " + getEmployee() + " " + getDay() + " " + getNumberToContact();
    }
}

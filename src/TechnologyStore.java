import java.util.List;

public class TechnologyStore extends Shop{

  
       private String inventory;
    
        public TechnologyStore(String name, String address, String inventory, String numberToContact, String webSite, List<Employee> employee, DayEnum day) {
        super(name, address, numberToContact, webSite, employee, day);
        this.inventory = inventory;
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
        return "TechnologyStore : " + getName() + " " + getEmployee() + " " + getDay() + " " + getNumberToContact();
    }
}

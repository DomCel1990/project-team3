
import java.util.List;

public class TechnologyStore extends Shop {
    private List<TecnologyProducts> inventory;

    public TechnologyStore(String name, String address, List<TecnologyProducts> inventory,
                           String numberToContact, String webSite, List<Employee> employee, DayEnum day) {
        super(name, address, numberToContact, webSite, employee, day);
        this.setInventory(inventory);
    }

    @Override
    public double outputCalculation() {
        double costProducts=0;
        double costEmployee=0;
        for (int i = 0; i < getInventory().size() ; i++) {
            costProducts+= getInventory().get(i).getPrice();
        }
        for (int i = 0; i <getEmployee().size(); i++) {
            costEmployee+=getEmployee().get(i).salaryCalculator(getEmployee().get(i));
        }
        double totalcost=costEmployee+costProducts;
        return totalcost;
    }

    public void addEmployee(int i, Employee employee) {
        getEmployee().add(i, employee);
    }

    void removeEmployee(int i) {
        getEmployee().remove(i);
    }

    public void addTechnologyProducts(int i, TecnologyProducts inventory) {
        getInventory().add(i,inventory);
    }
    @Override
    public String averageMarks() {
        return null;
    }

    @Override
    public String toString() {
        return "TechnologyStore : " + getName() + " " + getEmployee() + " " + getDay() + " " + getNumberToContact();
    }

    public List<TecnologyProducts> getInventory() {
        return inventory;
    }

    public void setInventory(List<TecnologyProducts> inventory) {
        this.inventory = inventory;
    }
}

package workshops;

import staff.Day;
import staff.Employee;
import product.TechnologyProducts;


import java.util.List;

public class TechnologyStore extends workshops.Shop {
    private List<TechnologyProducts> inventory;

    public TechnologyStore(String name, String address, List<TechnologyProducts> inventory,
                           String numberToContact, String webSite, List<Employee> employee, Day day) {
        super(name, address, numberToContact, webSite, employee, day);
        this.setInventory(inventory);
    }

    public TechnologyStore(List<Employee> employee, List<TechnologyProducts> inventory){
        super(employee);
        this.inventory = inventory;
    }

    @Override
    public double outputCalculation() {
        double costProducts=0;
        double costEmployee=0;
        for (int i = 0; i < getInventory().size() ; i++) {
            costProducts+= getInventory().get(i).getPrice();
        }
        for (int i = 0; i <getEmployee().size(); i++) {
            costEmployee+=getEmployee().get(i).calculatorSalary();
        }
        double totalcost=costEmployee+costProducts;
        return totalcost;
    }

    public void addEmployee(int i, Employee employee) {
        getEmployee().add(i, employee);
    }

    public void removeEmployee(int i) {
        getEmployee().remove(i);
    }

    public void addTechnologyProducts(int i, TechnologyProducts inventory) {
        getInventory().add(i,inventory);
    }

    @Override
    public String averageMarks() {
        return null;
    }

    @Override
    public String toString() {
        return "workshops.TechnologyStore : " + getName() + " " + getEmployee() + " " + getDay() + " " + getNumberToContact();
    }

    public List<TechnologyProducts> getInventory() {
        return inventory;
    }

    public void setInventory(List<TechnologyProducts> inventory) {
        this.inventory = inventory;
    }
}

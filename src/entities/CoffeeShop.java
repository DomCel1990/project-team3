package entities;

import java.util.List;

public class CoffeeShop extends Shop {

    private List<CoffeProduct> inventory;

    public CoffeeShop(String name, String address, String numberToContact, String webSite, List<Employee> employee, Day day) {
        super(name, address, numberToContact, webSite, employee, day);
        this.setInventory(inventory);
    }

    @Override
    public double outputCalculation() {
        double costProducts = 0;
        double costEmployee = 0;
        for (int i = 0; i < getInventory().size(); i++) {
            costProducts += getInventory().get(i).getPrice();
        }
        for (int i = 0; i < getEmployee().size(); i++) {
            costEmployee += getEmployee().get(i).calculatorSalary();
        }
        double totalcost = costEmployee + costProducts;
        return totalcost;
    }

    void addEmployee(int i, Employee employee) {
        getEmployee().add(i, employee);
    }


    void removeEmployee(int i) {
        getEmployee().remove(i);
    }

    @Override
    public String averageMarks() {
        return null;
    }

    @Override
    public String toString() {
        return "entities.CoffeeShop : " + getName() + " " + getEmployee() + " " + getDay() + " " + getNumberToContact();
    }

    public List<CoffeProduct> getInventory() {
        return inventory;
    }

    public void setInventory(List<CoffeProduct> inventory) {
        this.inventory = inventory;
    }
}

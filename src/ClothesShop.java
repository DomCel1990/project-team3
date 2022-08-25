public class ClothesShop extends Shop {

     private String inventory;

    public ClothesShop(String name, String address, String numberToContact, String webSite, list <Employee> employee, DayEnum day, String inventory) {
        super(name, address, numberToContact, webSite, employee, day);
        this.inventory = inventory;
    }


    public void addEmployee(){}

    public void removeEmployee(){}

    public String averageMarks(){
        return null;
    }

    @Override
    public String toString() {
        return "ClothesShop : " + name +" "+ employee +" "+ day +" "+ webSite +" "+ inventory;
    }
}

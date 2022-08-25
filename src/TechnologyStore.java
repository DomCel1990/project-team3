public class TechnologyStore extends Shop{

    private String name;
    private Employee employee;
    private DayEnum day;
    private String inventory;
    private String website;


    public TechnologyStore(String name, String address, String inventory, String numberToContact, String webSite, Employee employee, DayEnum day) {
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
        return "TechnologyStore : " + name + " " + employee + " " + day + " " + numberToContact;;
    }
}

public abstract class Shop {

    private String name;
    private String address;
    private String numberToContact;
    private String webSite;
    private Employee employee;
    private DayEnum day;

    public Shop(String name, String address, String numberToContact, String webSite, Employee employee, DayEnum day) {
        this.name = name;
        this.address = address;
        this.numberToContact = numberToContact;
        this.webSite = webSite;
        this.employee = employee;
        this.day = day;
    }

    public abstract String averageMarks();
    @Override
    public abstract String toString();
}

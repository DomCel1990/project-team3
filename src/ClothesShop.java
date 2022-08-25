import java.util.List;

public class ClothesShop extends Shop {

    //valutare se attribuire al cliente anzi che al negozio
    // i clienti possono avere una lista di card
    private LoyalityCardsEnum card;


    public ClothesShop(String name, String address, String numberToContact, String webSite, List<Employee> employee, DayEnum day) {
        super(name, address, numberToContact, webSite, employee, day);
        this.card=card;
    }

    @Override
    public String averageMarks() {
        return null;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" +
                "Address: " + getAddress() + "\n" +
                "Number contact: " + getNumberToContact() + "\n" +
                "Website: " + getWebSite() + "\n" +
                "Employee: " + getEmployee() + "\n" +
                "Day: " + getDay();
    }
}
}

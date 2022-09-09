package entities;

public class Client {

    private String name;
    private String surname;
    private String email;
    private String address;
    private int id;
    private int age;
    private boolean hasLoyaltyCard;
    private LoyaltyCard card;

    public Client(String name, String surname, String email, String address, int id, int age, boolean hasLoyaltyCard, LoyaltyCard card){
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
        this.id = id;
        this.age = age;
        this.hasLoyaltyCard = hasLoyaltyCard;
        this.card = card;
    }

    public void addClient(Client c){
        c.addClient(c);
    }

    public void removeClient(Client c){
        c.removeClient(c);
    }

    public void assignLoyaltyStandardCard(Client client){
        client.setCard(LoyaltyCard.STANDARDCARD);
    }

    public void assignLoyaltyPremiumCard(Client client){
        client.setCard(LoyaltyCard.PREMIUMCARD);
    }

    public void assignLoyaltyGoldCard(Client client){
        client.setCard(LoyaltyCard.GOLDCARD);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", hasLoyaltyCard=" + hasLoyaltyCard +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHasLoyaltyCard() {
        return hasLoyaltyCard;
    }

    public void setHasLoyaltyCard(boolean hasLoyaltyCard) {
        this.hasLoyaltyCard = hasLoyaltyCard;
    }

    public LoyaltyCard getCard() {
        return card;
    }

    public void setCard(LoyaltyCard card) {
        this.card = card;
    }
}
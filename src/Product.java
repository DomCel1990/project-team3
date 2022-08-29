public abstract class Product {

    private String description;
    private double price;
    private String type;
    private String serialCode;

    public Product(String description, double price, String type, String serialCode) {
        this.description = description;
        this.price = price;
        this.type = type;
        this.serialCode = serialCode;
    }

    @Override
    public String toString() {
        return "Product : " +
                "description=" + description  +
                ", price=" + price +
                ", type= " + type +
                ", serilCode= " + serialCode;
    }

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public double getPrice() {return price;}

    public void setPrice(double price) {this.price = price;}

    public String getType() {return type;}

    public void setType(String type) {this.type = type;}

    public String getSerialCode() {return serialCode;}

    public void setSerialCode(String serilCode) {this.serialCode = serilCode;}
}

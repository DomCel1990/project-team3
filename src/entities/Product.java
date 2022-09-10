package entities;

public abstract class Product {

    private String description;
    private double price;
    private double salePrice;
    private String type;
    private String serialCode;

    public Product(String description, double price,double salePrice, String type, String serialCode) {
        this.description = description;
        this.price = price;
        this.salePrice=salePrice;
        this.type = type;
        this.serialCode = serialCode;
    }
    public abstract double calculateProfit();

    public abstract boolean convenientProduct();

    public abstract String descriptionMaximum();

    

    @Override
    public String toString() {
        return "Description: " + description  +"\n"+
                "Price: " + price +"\n"+
                "Sale price: " + salePrice +"\n"+
                "Type: " + type +"\n"+
                "Serial code: " + serialCode;
    }
    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public double getPrice() {return price;}

    public void setPrice(double price) {this.price = price;}

    public String getType() {return type;}

    public void setType(String type) {this.type = type;}

    public String getSerialCode() {return serialCode;}

    public void setSerialCode(String serilCode) {this.serialCode = serilCode;}

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }
}

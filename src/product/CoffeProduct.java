package product;

public class CoffeProduct extends Product {


    public CoffeProduct(String description, double price, double salePrice, String type, String serialCode) {
        super(description, price, salePrice, type, serialCode);
    }

    @Override
    public double calculateProfit() {
        return getSalePrice()-getPrice();
    }

    @Override
    public boolean convenientProduct() {
        if (calculateProfit() < 0)
            return false;
        else
            return true;
    }

    @Override
    public String descriptionMaximum() {
        if (getDescription().length()>0 && getDescription().length()<100)
            return "OK";
        else
            return "Error";
    }
}

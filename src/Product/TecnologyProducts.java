package Product;

public class TecnologyProducts extends Product {


    public TecnologyProducts(String description, double price, double salePrice, String type, String serialCode) {
        super(description, price, salePrice, type, serialCode);
    }

    public TecnologyProducts(double price, double salePrice){
        super (price, salePrice);
    }

    @Override
    public double calculateProfit() {
        return getSalePrice() - getPrice();
    }

    @Override
    public boolean convenientProduct() {
        if (calculateProfit() < 0)
            return false;
        else
            return true;
    }
    public String descriptionMaximum(){
        if (getDescription().length()>0 && getDescription().length()<100)
            return "OK";
        else
           return "Error";
    }
}

package ua.goit.groceryStore;

public class Products {
    private String name;
    private double price;
    private String productCode;

    public Products(String name, double price, String productCode) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
}

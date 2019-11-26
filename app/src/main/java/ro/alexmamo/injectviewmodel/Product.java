package ro.alexmamo.injectviewmodel;

public class Product {
    public String id, name;
    @SuppressWarnings("WeakerAccess")
    public double price;

    @SuppressWarnings("unused")
    public Product() {}

    @SuppressWarnings("unused")
    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
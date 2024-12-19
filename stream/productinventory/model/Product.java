package stream.productinventory.model;

public class Product {
    private int id;
    private String name;
    private String category;
    private int quantity;
    private double price;
    private String supplier;

    public Product(String supplier, int id, String category, String name, int quantity, double price) {
        this.supplier = supplier;
        this.id = id;
        this.category = category;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getSupplier() {
        return supplier;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", supplier='" + supplier + '\'' +
                '}';
    }
}

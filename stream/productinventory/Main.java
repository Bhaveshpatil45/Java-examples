package stream.productinventory;

import stream.productinventory.model.Product;
import stream.productinventory.service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        ProductService productService = new ProductService();

        // Adding products to the list
        products.add(new Product("Supplier A", 1, "Laptop", "Electronics", 10, 70000));
        products.add(new Product("Supplier B", 2, "Chair", "Furniture", 5, 3000));
        products.add(new Product("Supplier A", 3, "Smartphone", "Electronics", 20, 40000));
        products.add(new Product("Supplier C", 4, "Table", "Furniture", 0, 8000));
        products.add(new Product("Supplier A", 5, "Headphones", "Electronics", 15, 2000));

        System.out.println("-------------------------------------------");
        productService.productCategory(products, "Electronics");

        System.out.println("-------------------------------------------");
        productService.outOfStock(products);

        System.out.println("-------------------------------------------");
        productService.sortByPrice(products);

        System.out.println("-------------------------------------------");
        double totalValue = productService.totalInventoryValue(products);

        System.out.printf("total Inventory Value: %.2f\n", totalValue);
        System.out.println("-------------------------------------------");
        productService.ProductsGroupedByCategory(products);
    }
}

package stream.productinventory.service;

import stream.productinventory.model.Product;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductService {

    public void productCategory(List<Product> products, String category) {
        System.out.println("Products in category: " + category);
        products.stream()
                .filter(product -> product.getCategory().equalsIgnoreCase(category))
                .forEach(System.out::println);
    }


    public void outOfStock(List<Product> products) {
        System.out.println("out of stock products: ");
        products.stream()
                .filter(product -> product.getQuantity() == 0)
                .forEach(System.out::println);
    }


    public void sortByPrice(List<Product> products) {
        System.out.println("Products sorted by price: ");
        products.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .forEach(System.out::println);
    }


    public double totalInventoryValue(List<Product> products) {
        return products.stream()
                .mapToDouble(product -> product.getPrice() * product.getQuantity())
                .sum();
    }


    public void ProductsGroupedByCategory(List<Product> products) {
        Map<String, List<Product>> groupedByCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));
        System.out.println("Products grouped by category: ");
        groupedByCategory.forEach((category, productList) -> {
            System.out.println(category + ": " + productList);
        });
    }
}

package stream.productinventory.model;


import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductService {
    public void productCategory(List<Product> products, String category){
        System.out.println("Products in category: " + category);
        products.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase(category))
                .forEach(System.out::println);
    }

    public void outOfStock(List<Product> products){
        System.out.println("out of stock products: ");
        products.stream()
                .filter(p -> p.getQuantity() == 0)
                .forEach(System.out::println);
    }

    public void sortByPrice(List<Product> products, String category){
        System.out.println("Products sorted by price: " + category);
        products.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .forEach(System.out::println);
    }

    public double totalInventoryValue(List<Product> products){
        System.out.println("out of stock products: ");
        return products.stream()
                .mapToDouble(p -> p.getPrice() * p.getQuantity())
                .sum();
    }

    public void ProductsGroupedByCategory(List<Product> products){
        System.out.println("Products grouped bu category: ");
        Map<String, List<Product>> groupedByCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));
        groupedByCategory.forEach(category, productList) -> {
            System.out.println(category + ": " + productList);
        });
    }
}

import java.io.*;
import java.util.*;

class Product {

    int productId;
    String productName;
    double price;

    Product(int id, String name, double price) {
        this.productId = id;
        this.productName = name;
        this.price = price;
    }
}

interface Inventory {

    void addProduct(Product product);

    int getTotalProducts();

    Product getHighestPriceProduct();

    Product getLowestPriceProduct();
}

class ProductStore implements Inventory {

    List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public int getTotalProducts() {
        // Write your logic here
        return products.size();
    }

    public Product getHighestPriceProduct() {
        // Write your logic here
        Product maxProduct = products.get(0);
        for (Product product : products) {
            if(product.price > maxProduct.price){
                maxProduct = product;
            }
        }
        return maxProduct;
    }

    public Product getLowestPriceProduct() {
        // Write your logic here
        Product minProduct = products.get(0);
        for (Product product : products) {
            if(product.price < minProduct.price){
                minProduct = product;
            }
        }
        return minProduct;
    }
}

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        ProductStore store = new ProductStore();

        for(int i = 0; i < n; i++) {

            String[] input = br.readLine().split(" ");

            int id = Integer.parseInt(input[0]);
            String name = input[1];
            double price = Double.parseDouble(input[2]);

            store.addProduct(new Product(id, name, price));
        }

        System.out.println("Total Products: " + store.getTotalProducts());
        System.out.println("Highest Price Product: " + store.getHighestPriceProduct().productName);
        System.out.println("Lowest Price Product: " + store.getLowestPriceProduct().productName);
    }
}
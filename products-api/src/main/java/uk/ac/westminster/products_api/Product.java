
package uk.ac.westminster.products_api;

public class Product {

    // Product details
    public Long id;
    public String name;
    public double price;

    // Constructor
    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it has the shared properties of every product.
// A ShoppingCart is not a Product because it contains products rather than being one.
public class PhysicalProduct extends Product implements Discountable {

    private double weightKg;
    private String dimensions;
    private double discountedPrice;

    // Empty constructor for JSON deserialization
    public PhysicalProduct() {
    }

    // Full constructor
    public PhysicalProduct(Long id, String name, double price,
                           double weightKg, String dimensions) {
        super(id, name, price);

        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }

    @Override
    public String getSummary(){
        return "Physical: " +  getName() + " | Weight: " + weightKg + " kg";
    }
    //overrides the generic getSummary() method inherited from Product

    @Override
    public void applyDiscount (double rate){
        double capped = Math.min(rate, 0.29);
        this.discountedPrice = getPrice() * (1-capped);
    }

    @Override
    public double getDiscountedPrice(){
        return discountedPrice;
    }
}


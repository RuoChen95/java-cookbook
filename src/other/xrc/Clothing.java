package other.xrc;

public class Clothing implements Comparable<Clothing>{
    String description;
    double price;
    double tax;
    String size = "M";

    public String getSize() {
        return size;
    }

    // 6-3: Use Static Constants
    public static final double MIN_PRICE = 10.0;
    public static final double MIN_TAX = 0.2;


    // Exercise 5-1 Apply Encapsulation
    public double getPrice() {
        return price * (1 + tax);
    }

    public void setPrice(double price) {
        this.price = (price > MIN_PRICE) ? price : MIN_PRICE;
    }


    // 6-2: Add Clothing Constructor
    public Clothing() {}

    public Clothing(String adescription, double aprice, double atax, String size) {
        description = adescription;
        price = aprice;
        tax = atax;
        this.size = size;
    }

    // 8-1: Override the toString Method
    @Override
    public String toString() {
        return description + ", " + price;
    }

    // 8-2 Comparable algorithm using interfaces
    @Override
    public int compareTo(Clothing c) {
        return this.description.compareTo(c.description);
    }

}

package other.xrc;

public class Customer {
    String name;
    String size;

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return this.size;
    }

    // 5-2 method overloading
    public void setSize(int measurement) {
        // Exercise 4-1 switch statement
        switch (measurement) {
            case 1:
            case 2:
            case 3:
                this.size = "S";
                break;
            case 4:
            case 5:
            case 6:
                this.size = "M";
                break;
            case 7:
            case 8:
            case 9:
                this.size = "L";
                break;
            default:
                this.size = "O";
        }
    }


    // 5-3 Associate "Customer" with "Clothing"

    private Clothing[] items;
    public void setItems(Clothing[] someItems) {
        this.items = someItems;
    }
    public Clothing[] getItems() {
        return this.items;
    }
    public double getTotalClothingCost() {
        double total = 0.0;
        for (Clothing item : this.items) {
            total += item.getPrice();
        }
        return total;
    }

    // 6-1: Add Customer Constructor
    public Customer() {
    }
    public Customer(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public Customer(String name, int measurement) {
        this.name = name;
        setSize(measurement);
    }

    // 7-1
    public void getAverageTotalClothingCost() {
        double total = 0.0;
        int count = 0;
        double average = 0.0;
        for (Clothing item : this.items) {
            if (item.getSize().equals("S")) {
                total += item.getPrice();
                count ++;
            }
        }
        System.out.println(total);
        System.out.println(count);
//        try {
//            average = total / count;
//            System.out.println(average);
//        } catch (ArithmeticException e) {
//            System.out.println(e);
//        }

        average = count == 0 ? 0 : total/count;
        System.out.println(average);
    }
}

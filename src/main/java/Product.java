//Class done

public abstract class Product {
    private String name;
    private double price;
    Size size;
    private final double totalPrice = getPrice();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Product(String name, double price, Size size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    @Override
    public String toString() {
        return name + price;
    }
}

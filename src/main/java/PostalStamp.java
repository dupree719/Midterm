//Class done

public class PostalStamp extends Product implements IPrint, ILickable{
    private int amount;

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public PostalStamp(String name, double price, Size size) {
        super(name, price, size);
    }

    @Override
    public void print() {
        System.out.println("Printing stamp");

    }

    @Override
    public boolean safeToLick() {
        return true;
    }
}

//Class done

public class Battery extends Product implements IConsumable{
    public Battery(String name, double price, Size size) {
        super(name, price, size);
    }

    @Override
    public void consume() {
        System.out.println("Now using battery...");
    }
}

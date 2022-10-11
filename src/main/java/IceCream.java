//Class done

public class IceCream extends Product implements IConsumable, ILickable{
    Size size;

    public IceCream(String name, double price, Size size) {
        super(name, price, size);
    }

    @Override
    public void consume() {
        System.out.println("Lick lick");

    }

    @Override
    public boolean safeToLick() {
        return true;
    }
}

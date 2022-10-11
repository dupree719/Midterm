import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Q1 Create instance of Admin class
        Admin admin = new Admin("adminUSER", "adminPW");

        //Q2 Customer objects
        ArrayList<String> addresses = new ArrayList<>();
        //Give all customers same address
        addresses.add("50 Code Street, Newark, DE, 19702");
        addresses.add("71 Code Street, Newark, DE, 19702");
        addresses.add("13 Code Street, Newark, DE, 19702");


        //Created objects to store in products array
        IceCream iceCream = new IceCream("vanilla icecream", 4.99, Size.M);
        Battery battery = new Battery("AAA battery", 14.99, Size.L);
        PostalStamp postalStamp = new PostalStamp("Stamp", 1.95, Size.S);

        //Give all customers same products
        Product[] products = {iceCream, battery, postalStamp};

        Customer customer1 = new Customer("1", "password1", 1000, Size.L, addresses, products);
        Customer customer2 = new Customer("2", "password2", 1000, Size.S, addresses, products);
        Customer customer3 = new Customer("3", "password3", 1000, Size.M, addresses, products);

       //Q3 Set customer1 balance to -150 with setter, make it so negative balances do not print
        customer1.setAccountBal(-150.0);
        System.out.println("\n");

        //Q4 Give customer1 1000 reward points
        customer1.giveCustomer1AwardPts(1000);
        System.out.println("\n");

        //Q5 Invoke useRewardPoints on customer1
        System.out.println("customer1:");
        customer1.useRewardPoints(100);
        System.out.println("\n");

        //Q6 Call a method to retrieve only second address of customer1
        System.out.println("Now getting customer1 secondary address:");
        customer1.getSecondAddress();
        System.out.println("\n");


        //Q7 Set customer1's size to medium
        customer1.setSize(Size.M);

        //Q8 Print customer1's info
        System.out.println("Now printing customer1's information:");
        customer1.print();

        //Q9 Consume consumables
        System.out.println("\n");
        System.out.println("Now consuming..");
        IConsumable[] consumables = {iceCream, battery};
        App.consumeConsumables(consumables);
        System.out.println("\n");
        //Q10 Set amount of stamps to 3
        postalStamp.setAmount(3);

        //Q11 Print all printable products
        System.out.println("Printing all printables:");
        IPrint[] printables = {postalStamp};
        App.printAllPrintableObjects(printables);
        System.out.println("\n");

        //Q12 Get and print Total price of customer1's products
//          double totalPrice = iceCream.getPrice() + postalStamp.getPrice() + battery.getPrice();
        ArrayList<Product> productPrices = new ArrayList<>();
        productPrices.add(iceCream);
        productPrices.add(postalStamp);
        productPrices.add(battery);
        App.reverseSortAndPrintALlProductsByPrice(productPrices);
        System.out.println(productPrices);



    }

}

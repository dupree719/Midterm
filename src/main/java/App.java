import java.util.*;

public class App {

        public static void printAllPrintableObjects(IPrint[] printables){
            //loop through the array with for loop
            for (IPrint x : printables){
                System.out.println(x);
            }

        }

        public static void consumeConsumables(IConsumable[] consumables) {

            for (IConsumable consumable : consumables) {
                System.out.println(consumable);

            }
        }
//            public static void getTotalPriceOfCustomerProducts(Customer customer){
//
//
//
//                    }
    public static void reverseSortAndPrintALlProductsByPrice(ArrayList<Product> productPrices){

            productPrices.sort(Comparator.comparingDouble(Product::getPrice));

        productPrices.forEach(System.out::println);
    }

}




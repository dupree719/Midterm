import java.util.*;

//Class done




public class Customer extends User{
    private int rewardPoints;
    private double accountBal;
    Size size;
    ArrayList<String> addresses;
    Product[] products;


    public Customer(String username, String password, int rewardPoints, Size size, ArrayList<String> addresses, Product[] products) {
        super(username, password);
        this.rewardPoints = rewardPoints;
        this.accountBal = accountBal;
        this.size = size;
        this.addresses = addresses;
        this.products = products;

    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public double getAccountBal() {
        return accountBal;
    }

    public void setAccountBal(double accountBal) {
        this.accountBal = accountBal;
            if(accountBal >= 0){
                System.out.println("Account balance: " + accountBal);
            }else{
                System.out.println("Error! Account balance is negative.");
            }


        }


    @Override
    public String toString() {
        return "Customer{" +
                "rewardPoints=" + rewardPoints +
                ", accountBal=" + accountBal +
                ", size=" + size +
                ", address=" + addresses +
                ", products=" + Arrays.toString(products) +
                '}';
    }

    public void useRewardPoints(int usedRewardPts){


        int remainingRewardPts = rewardPoints-usedRewardPts;
        System.out.println("Just used " + usedRewardPts + " points. You now have " + remainingRewardPts + " reward points remaining.");

    }

    @Override
    public void print() {
        System.out.println("Customer{" +
                "Reward Points balance= " + rewardPoints +
                "\n Account balance= " + accountBal +
                "\n Size= " + size +
                "\n Addresses= " + addresses +
                "\n Products in cart= " + Arrays.toString(products) +
                '}');

    }
    public void giveCustomer1AwardPts(int rewardPoints){
        System.out.println("Giving customer1 " + rewardPoints + " reward points!");
    }
    public void getSecondAddress(){
        System.out.println(addresses.get(1));
    }
}


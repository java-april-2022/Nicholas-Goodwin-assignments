package Week1.Cafelogic;
import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal() {
        int sum = 0;
        for(int week = 1; week <= 10; week++) {
            sum+= week;}
        return sum;
    } // first method implemented and tested! still needs sensei added!

    public double getOrderTotal(double[] lineItems) {
        double sum = 0;
        for(double price: lineItems){
            sum+=price;
        }
        return sum;
    } //second method implemented and tested! 

    public void displayMenu(ArrayList<String> menuItems) {
        for(int id=0; id < menuItems.size(); id++) {
            System.out.printf("%s %s \n", id, menuItems.get(id));
        }
    }// used https://dzone.com/articles/java-string-format-examples for more string formatting help.
    //tested and operable

    public void addCustomer(ArrayList<String> customerList) {
        System.out.println("Please enter a name!");
        String userName = System.console().readLine();
        System.out.printf("Good Evening %s,", userName);
        System.out.printf("there are %s people in line in front of you.", customerList.size());
        customerList.add(userName);
        System.out.println(customerList);
    }

    public void printPriceChart(String itemName, double price, int maxAllowed) {
        System.out.printf("%s\n", itemName);
        for(int allowed = 1; allowed<maxAllowed; allowed++) {
            System.out.printf("%s - $%.2f\n", allowed, allowed*price);
        }
        System.out.println("");
    }// Used https://docs.oracle.com/javase/tutorial/java/data/numberformat.html for output formatting. 
}// have not added last ninja bonus.



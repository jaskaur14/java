import java.util.ArrayList;

// our goals for this assignment
// int getStreakGoal()
// double getOrderTotal(double[]prices)
// void displayMenu(ArrayList<String>menuItems)
// addCustomer(ArrayList<String>customers)

public class CafeUtil {
    
    // getStreakGoal
    // for loop?
    public int getStreakGoal() {
        int sum = 0;
        for (int week = 1; week <=10; week++) {
            sum+= week;
        }
        return sum;
        // adds every consecutive integer and returns sum
    }
    // Given an array of item prices from an order, 
    // add all of the prices in the array and return the total.
    public double getOrderTotal(double[] lineItems) {
        double sum = 0;
        // for(element container : collection)???
        // enhanced loop bc you dont need to worry about the index
        for (double price: lineItems) {
            sum+= price;
        }
        return sum;
    }
    // voidDisplayMenu
    // Given an ArrayList of menu items (strings),
    //  print out each index and menu item.
    public void displayMenu(ArrayList<String> menuItems) {
        for (int item = 0; item < menuItems.size(); item++) {
            System.out.printf("%s %s \n", item, menuItems.get(item));
        }
        // menuItems.size is returning the number of elements on the list
        // %s expects the string
        // \n creates a new line
        // .get gets item out of list
    }
    // addCustomer
    // myArray.add("Heidi"); // to add an item to an ArrayList
    public void addCustomer(ArrayList<String> customerList) {
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        System.out.println("Hello " + username + "!");
        System.out.printf("There are " + customerList.size() + " people ahead of you. \n");
        customerList.add(username);
        System.out.println(customerList);
    }
}

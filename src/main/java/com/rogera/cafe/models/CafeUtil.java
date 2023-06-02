package com.rogera.cafe.models;

import java.util.ArrayList;

public class CafeUtil {

// int getStreakGoal()
    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }

//double getOrderTotal(double[] prices)
    public double GetOrderTotal(double[] prices) {
        double sum = 0.00;
        for (double price : prices) {
            sum += price;
        }
        return sum;
    }

//void displayMenu(ArrayList<String> menuItems)
    public void displayMenu(ArrayList<String> menuItems) {
        int counter = 0;
        for (String menuItem : menuItems) {
            System.out.println(String.format("%s %s", counter, menuItem));
            counter += 1;
        }

    }


//addCustomer(ArrayList<String> customers)
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
  

        System.out.println(String.format("Hello, %s", userName));
        int customersInArray = customers.size();
        System.out.println(String.format("There are %s people in front of you!", customersInArray));
        customers.add(userName);
        for (String customer : customers) {
            System.out.println(customer);
        }
    }

    // add Customer to the list
    public void addCustomer() {

        System.out.println("Please enter customer name (enter 'q' to end session.):");
        String customerEntered = ""; 
        String exitStrat = "q"; 

        // Customers list
        ArrayList<String> customers = new ArrayList<String>();

        while (customerEntered.equals(exitStrat) == false) {
            customerEntered = System.console().readLine();
            if (customerEntered.equals(exitStrat)) {
                break;
            }
            customers.add(customerEntered);
        }



    }

  

    // BRACKET END
}

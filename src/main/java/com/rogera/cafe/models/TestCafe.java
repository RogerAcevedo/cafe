package com.rogera.cafe.models;

import java.util.ArrayList;

public class TestCafe {

	    public static void main(String[] args) {


	        CafeUtil cafeUtil = new CafeUtil();
	        System.out.println("");
	        
// int getStreakGoal()
	        int streakGoal = cafeUtil.getStreakGoal(10);
	        System.out.println(String.format("Customer Streak %s.", streakGoal));
	        System.out.println("");

	        System.out.println("\n----- Streak Goal Test -----");
	        System.out.printf("Purchases needed by week 10: %s \n\n", cafeUtil.getStreakGoal(10));
	        System.out.println("");
	       
//double getOrderTotal(double[] prices)
	        double[] lineItems = { 3.5, 1.5, 4.0, 4.5, 6.25, 2.25 };
	        double orderTotal = cafeUtil.GetOrderTotal(lineItems);
	        System.out.println("----- Order Total Test-----");
	        System.out.printf("Order total: %s \n\n", orderTotal);
	        System.out.println("");

	        System.out.println("----- Display Menu Test-----");
	        System.out.println("");

//void displayMenu(ArrayList<String> menuItems)
	        ArrayList<String> menu = new ArrayList<String>();
	        menu.add("drip coffee");
	        menu.add("cappuccino");
	        menu.add("latte");
	        menu.add("mocha");
	        cafeUtil.displayMenu(menu);
	        System.out.println("");

//addCustomer(ArrayList<String> customers)	        
	       
	        ArrayList<String> customers = new ArrayList<String>();
	        // // --- Test 4 times ---
	        for (int i = 0; i < 4; i++) {
	            cafeUtil.addCustomer(customers);
	            System.out.println("\n");
	        }
	        System.out.println("");


	    }
	    
// BRACKET END	    
	}

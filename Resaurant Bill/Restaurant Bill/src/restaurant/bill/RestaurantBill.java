/*
 * Restaurant Bill
 * By Harry van der Veen
 * Made on 03/05/19

This program will calculate and display the cost with tax for 
a meal
 */
package restaurant.bill;

import java.text.DecimalFormat; //Importing Decimal format for later use
public class RestaurantBill {

    public static void main(String[] args) {
       
        double mealcost = 23.94, total, HST; //Creating the variables for the recipt
       
       HST = mealcost*0.13;      //These are the formuli for HST and the total cost
       total = mealcost+HST;
       
       DecimalFormat money = new DecimalFormat("$#.00"); //Using decimal format to add correct decimal places and dollar signs to all numbers
       
       //This next line prints out all of the numbers on different lines using decimal format for numbers
       System.out.println("Restaurant Bill \n***************\n\n" + "Meal:\t" + money.format(mealcost) + "\nHST:\t" + money.format(HST) + "\nTotal:\t" + money.format(total)); 
    }
}
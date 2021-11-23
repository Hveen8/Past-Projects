/* Program Name: AverageValue
   Description: This program prompts a user for a value and keeps
   accepting values until a zero is entered. When a zero is entered the
   average is displayed.*/

package averagevalue;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double numOfValues = 0;  //counter
        double sumOfValues = 0;  //accumulator
        double value, average;

        // the Scanner class will be used for accepting input from the Console.
        Scanner sc = new Scanner(System.in);

        System.out.println("This program will add up the numbers you enter");
        System.out.println("until you enter a 0, at which point it will show");
        System.out.println("you the average of all the numbers you entered \n");

        do{
            System.out.println("Please enter a value");
            value = sc.nextDouble();

            if (value != 0)
            {
                numOfValues ++;
                sumOfValues = sumOfValues + value;
            }
        } while (value != 0);

        average = sumOfValues/numOfValues;
        System.out.println("The average of all numbers entered is: " + average);
    }
}

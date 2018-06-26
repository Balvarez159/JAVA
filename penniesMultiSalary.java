import java.text.NumberFormat; //Formats the decimal (cents)
import java.util.*;

public class penniesMultiSalary 
    {
       public static void main(String[] args)
        {
        int day, DaysWorked, run = 0; double finalsalary, currentpay;  
        do {
           Scanner keyboard = new Scanner (System.in);
           NumberFormat AmericanMoney = NumberFormat.getCurrencyInstance(Locale.US); //Converts total salary into US dollars
       
           finalsalary = 0;
           currentpay = 0.01;
       
           System.out.println("How many days did you work?");
           DaysWorked = keyboard.nextInt();
       
           if (DaysWorked < 1)          
           { //Anythign less than one day will give an error
           System.out.println("Invalid input: " + DaysWorked + ", Please enter at least one day!");
           }
        
        System.out.println("Days Worked            Daily Salary"); //Displays a table with results
        System.out.println("--------------------------------------");
    
    
        for (day = 1; day <= DaysWorked; day++) //Loops the currentpay with the each day of work
           {      
           System.out.println(  day + "\t \t \t \t \t \t \t \t \t" + currentpay);
           finalsalary += currentpay;      
           currentpay = currentpay * 2;
           }
        System.out.println("Your total salary is  \n " + AmericanMoney.format (+ finalsalary) + "\n");
    
           }
        while (run < 1); //Loops the program again depending on input.

        }

     }
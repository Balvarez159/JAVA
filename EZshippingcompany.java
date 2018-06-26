

import java.util.Scanner;
 
public class EZshippingcompany {
 
    public static void main(String[] args) {
     
         
// EZShippingCompany shipping rules.
        //zip code depedant.
 
        //If first digit of zip code = 4, surcharge is 5%
        //If first digit of zip code = 6, surcharge is 9%
        //All other zip codes, surcharge is 14%
        //If zip code is even, then an extra charge of 2%
         
         
        //Weight under 5 pounds, charge is $12.00
        //Weight over 5 pounds, charge increases:
        //if greater than 5.1 and less than or equal to  15, the charge is $14.00
        //if greater than 15.1 and less than or equal to  34, the charge is $17.00
        //if greater than 34.1 and less than or equal to  45, the charge is $21.00
        //if greater than 45.1 and less than or equal to  60, the charge is $33.00
        //if greater than < 60, it is $105.00
 
 
 
Scanner input= new Scanner(System.in);
 
System.out.println("How much does your package weight");
 
double weights=input.nextDouble();

double totalWeight = weights;
 
System.out.println("The total totalWeight of your package is:  " + totalWeight);
 
double charge=0;
double surCharge;
double extraCharge;
double totalCost;
 
if(totalWeight <=5) {charge= 12;}

else if (totalWeight >= 5.1 && totalWeight <=15) {charge= 14;}

else if (totalWeight >=15.1 && totalWeight <=34) {charge= 34;} 
 
else if (totalWeight >=34.1 && totalWeight <=45) {charge=21;}
 
else if (totalWeight >=45.1 && totalWeight <=60) {charge=33;}
 
else {charge= 105.00;}
     
    System.out.println("Please enter the FIRST digit of your zip code:  ");  
int zip=input.nextInt();
 
switch (zip) {
                case 4: surCharge=0.05; 
            System.out.println("There is a surcharge of 5%"); break; 
                case 6: surCharge=0.09;
            System.out.println("There is a surcharge of 9%"); break;
                default: surCharge=0.14;
            System.out.println("There is a surcharge of 14%"); break;
            }
 
if (zip%2==0) {
                extraCharge=.02;
                totalCost= charge + charge * surCharge * extraCharge;
            System.out.println(totalCost); 
              }
 
 
else { totalCost= charge + charge * surCharge;}
System.out.println("Your total cost is: " +totalCost);
     } 
}
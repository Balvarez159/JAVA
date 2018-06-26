import javax.swing.JOptionPane;  // Needed for JOptionPane class
import java.text.DecimalFormat;  // Needed for the dollar decimal format

public class ShippingCharges
{
   public static void main(String[] args)
   {
      String input;                // To hold input
      int zipCode;                 // To hold the zip code the package is being sent to
      double weight, length,       // To hold the weight and length of the package
             width, height,        // To hold the width and height of the package
             shippingCost,         // To hold the shipping cost
             additionalCharge1,    // To hold additional charges for zip codes starting with 4, 6, etc.
             additionalCharge2,    // To hold the additional charge for zip codes that are even numbers
             totalCost;            // To hold the cost after the surcharge      
      
      // Get the recieving zip code
      input = JOptionPane.showInputDialog("Where is the package being sent? Please enter the zip code:");
      zipCode = Integer.parseInt(input);
      
      // Get the weight of the package
      input = JOptionPane.showInputDialog("How much does the package weigh(in lbs)?");
      weight = Double.parseDouble(input);
      
      // Get the length of the package
      input = JOptionPane.showInputDialog("What is the length of the package(in inches)?");
      length = Double.parseDouble(input);
      
      // Get the width of the package
      input = JOptionPane.showInputDialog("What is the width of the package(in inches)?");
      width = Double.parseDouble(input);
      
      // Get the height of the package
      input = JOptionPane.showInputDialog("What is the height of the package(in inches)?");
      height = Double.parseDouble(input);
      
      // Initialize the shipping cost
      shippingCost = 0.00;
      
      // Determine the shipping cost based on the weight and/or dimensions of the package.
      if (weight <= 5.0 && weight > 0.0)
         shippingCost = 12.00;
      else if ((length * height * width + weight) > 5.0 && (length * height * width + weight) <= 15.0)
         shippingCost = 14.00;
      else if ((length * height * width + weight) > 15.0 && (length * height * width + weight) <= 34.0)
         shippingCost = 17.00;
      else if ((length * height * width + weight) > 34.0 && (length * height * width + weight) <= 45.0)
         shippingCost = 21.00;
      else if ((length * height * width + weight) > 45.0 && (length * height * width + weight) <= 60.0)
         shippingCost = 33.00;
      else if ((length * height * width + weight) > 60.0)
         shippingCost = 105.00;
     
      // Initialize the additional charges
      additionalCharge1 = shippingCost * .14;
      additionalCharge2 = shippingCost * .00;
      
      // Apply the 5 % and 9 % surcharges if the zip code begins in a 4 or a 6, respectively
      if (zipCode / 10000 == 4)
         additionalCharge1 = shippingCost * .05;
      else if (zipCode / 10000 == 6)
         additionalCharge1 = shippingCost * .09;
      
      // Apply the 2% surcharge if the zip code is an even number
      if (zipCode % 2 == 0)
         additionalCharge2 = shippingCost * .02;
         
      // Get the calculation for the total cost
      totalCost = shippingCost + additionalCharge1 + additionalCharge2;
      
      // To assign the decimal dollar format to the shipping cost, surcharges, and total cost 
      DecimalFormat dollar = new DecimalFormat("#,##0.00");
         
      // Display the entered information, as well as the cost, back to the user
      JOptionPane.showMessageDialog(null, "The destination zip code is " + zipCode + ".\n" +
                                          "The length is: " + length + " inche(s).\n" +
                                          "The height is: " + height + " inche(s).\n" +
                                          "The width is: " + width + " inche(s).\n" +
                                          "The weight is: " + weight + " lb(s).\n");
      JOptionPane.showMessageDialog(null, "Your shipping cost is: $" + dollar.format(shippingCost) + 
                                          ".\nThe surcharge is: $" + dollar.format(additionalCharge1 + 
                                          additionalCharge2) + ".\nYour total shipping cost is: $" + 
                                          dollar.format(totalCost) + ".\n");
                                               
      System.exit(0); 
   }
}
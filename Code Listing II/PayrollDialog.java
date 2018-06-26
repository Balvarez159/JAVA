import javax.swing.JOptionPane;

/**
This program demonstrates using dialogs with JOptionPane.
Class Listing 2-33
*/

public class PayrollDialog
   {
   public static void main(String[] args)
      {
         String firstName; // The user's first name
         String lastName; // The user's last name
      
      
          // Get the user's name.
          firstName = JOptionPane.showInputDialog("What is " +
          "your  first name? ");
          
          // Get the user's name.
          lastNamee = JOptionPane.showInputDialog("What is " +
          "your last name? ");
          

          
           // Display a greeting
         JOptionPane.showMessageDialog(null, "Name " + firstname, + " " + lastname); 
         System.exit(0);

          // End the program.
          System.exit(0);
     }
}
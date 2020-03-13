/*
 * Rose Verma
 * 12/03/2020
 * Cubes amd Squared
 */

package cubesandsquared;

import java.util.Scanner;

/**
 *
 * @author Rover7740
 */
public class CubesAndSquared {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
       
        int choice = 0;
        System.out.println("Welcome to Cubes, Squares and powers!");
        System.out.println(" Your choices are: ");
        System.out.println(" 1: Find the value of a number squared. ");
        System.out.println(" 2: Find the value of a cubed. ");
        System.out.println(" 3: Find the value of a number, to any power.  ");
        System.out.println(" 4: Exit. ");
        System.out.println("Please enter your choice below!");
        
        choice = keyedInput.nextInt();
        
        System.out.println("");
        System.out.println("----------------------------------------------");
        
        if (choice == 1)
        { System.out.println(" you have choosen Option 1");
            System.out.println("Please enter a number below: ");
            
            int number = keyedInput.nextInt();
            
              number = number * number;
        {
            System.out.println(number);    
        }    
        }
        
         if (choice == 2)
        { System.out.println(" you have choosen Option 2");
            System.out.println("Please enter a number below: ");
            
            int number = keyedInput.nextInt();
            
              number = number * number * number;
        {
            System.out.println(number);    
        }    
        }
         if (choice == 3)
        { System.out.println(" you have choosen Option 3");
            System.out.println("Please enter a number below: ");
            int number = keyedInput.nextInt();
            System.out.println(" Please enter an exponent: ");
            int exponent = keyedInput.nextInt();
            double square = Math.pow(number,exponent);    
        {
            System.out.println(square);    
        }    
        }
        if (choice == 4)
        { System.out.println(" you have choosen Option 4");
            System.out.println("Exit ");
         System.exit(0);
        }
    }
    
    
}

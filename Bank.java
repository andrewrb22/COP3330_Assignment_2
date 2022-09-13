import java.util.Scanner;

/**
 * Bank
 */
public class Bank {

public static void main(String[] args) {
     int choice = 0;
    
     Account[]bank = new Account[5];



bank[2] = new Account("Andrew", 6.5, 10.0) ;


     System.out.println("Account Name: " + bank[2].getName() + "  Wiht a Balance of:" + bank[2].getBalance());

   choice = 6;
   double tax = 0.0;

 System.out.println( "New Balance: " + (bank[2].getBalance() + bank[2].applyRate(choice , tax)));

     
     // while (choice != 6) {
        
          






     // }

}


}
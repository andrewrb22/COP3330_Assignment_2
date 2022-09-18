
/**
 * bankAccounts
 */
import java.lang.reflect.Array;
import java.util.Scanner;

public class Bank {

     // Array account with size of 5
     public static Account[] bankAccounts = new Account[5];

     public static void main(String[] args) {
          int choice = 0;
          Scanner scan = new Scanner(System.in);

          // Testing
          // bankAccounts[0] = new Account("Andrew", 6.5, 120.0);
          // bankAccounts[1] = new Account("Tony", 10.5, 100.0);
          // bankAccounts[2] = new Account("Bruce", 7.5, 800.0);
          // bankAccounts[3] = new Account("Rogers", 3.5, 750.0);

          System.out.println("Welcome to Knightro bankAccountsing: ");
          while (choice != 6) {

               for (int i = 0; i < bankAccounts.length; i++) {

                    // System.out.print("Account Name: ");
                    if (bankAccounts[i] == null) {
                         System.out.println(((i + 1) + ". Empty."));
                    } else {
                         System.out.println((i + 1) + ". " + bankAccounts[i].getName());
                    }

               }
               System.out.println((bankAccounts.length + 1) + ". Exit Program");

               System.out.println("What would you like to do?");
               choice = scan.nextInt();

               // Valid or not valid account selected - IF/ELSE
               if (choice > 0 && choice <= bankAccounts.length) {

                    // if bank account is empty - ask to create account
                    if (bankAccounts[choice - 1] == null) {

                         System.out.println("Create New Account.");
                         System.out.println("What's the name of the account: ");
                         String name = scan.next();
                         System.out.println("What's the interest rate? ");
                         double rate = scan.nextDouble();
                         bankAccounts[choice - 1] = new Account(name, rate);

                    }
                    // If bank account is not null - Ask user what to do wit the account
                    else {

                         System.out.println("Choose from the following options: ");
                         System.out.println(
                                   "1. Deposit Funds \n 2. Withdraw Funds  \n3. Check Balance \n4. Calculate Interest \n5. Close Account");
                         System.out.println("What would you like to do?");
                         int option = scan.nextInt();

                         /************ Option 1 - Deposit Funds *****************/

                         if (option == 1) {
                              System.out.println("How much money would you like to deposit?");
                              double amount = scan.nextDouble();
                              // Check if amount is valid or not
                              if (bankAccounts[choice - 1].deposit(amount)) {
                                   System.out.printf("You have added $%.2\n", amount);
                              } else
                                   System.out.println("Invalid amount!");
                         }

                         /*********** Option 2 withdraw money from account **********/

                         if (option == 2) {
                              System.out.println("How much money would you like to withdraw from this account? ");
                              double amount = scan.nextDouble();

                              // check if amount is valid to make a withdraw

                              if (bankAccounts[choice - 1].withdraw(amount)) {
                                   System.out.printf("You have withdrawn $.2f\n", amount);
                              } else
                                   System.out.println("Invalid amount!");
                         }
                    }

               }

          }

     }
}

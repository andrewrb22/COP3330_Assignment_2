import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Bank
 */
public class Bank {

     public static void cuenta(int [] g){

          for (int i = 0; i < g.length; i++) {
               
               Array.set(g, i, i++);
               
          }
     }
     public static void main(String[] args) {
          int choice = 0;
          Scanner scan = new Scanner(System.in);
          Account[] bank = new Account[5];
         
          // bank[0] = new Account("Andrew", 6.5, 120.0);
          // bank[1] = new Account("Tony", 10.5, 100.0);
          // bank[2] = new Account("Bruce", 7.5, 800.0);
          // bank[3] = new Account("Rogers", 3.5, 750.0);

          System.out.println("Welcome to Knightro Banking: ");
          while (choice != 6) {

               for (int i = 0; i < bank.length; i++) {

                    // System.out.print("Account Name: ");
                    if (bank[i] == null) {
                         System.out.println(((i + 1) + ". Empty."));
                    } else {
                         System.out.println(bank[i].getName() + " Balance: " + bank[i].getBalance());
                    }

               }
               System.out.println("6. Exit Program");

                choice = scan.nextInt();
               
               for (int i = 0; i < bank.length; i++) {
                    System.out.println("What would you like to do?");
                    choice = scan.nextInt();
                    if ( bank[i] == choice && bank[i] == null) {
                         
                    }


               } 

            
          //     Array.set() will work for this project, if statment when choice is equal null value, change to account name.
               
               



          }
     }

}
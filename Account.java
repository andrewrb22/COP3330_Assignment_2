import java.util.Scanner;

/**
 * Account
 */

/*
 * Within the Bank Class do the following:
 * Create a private static array of Account. The size of the array will be 5.
 * Within the main method, create a menu that asks:
 * Displays the name of each account and the number.
 * Which account would you like to work on (Assign a value 1-5 to each account)
 * Exit Program
 * When they select the account, they can do the following:
 * If empty, it automatically creates an account.
 * To create an account, you need to ask the following information:
 * Account name
 * Interest rate (formatted as a double for example: 1.5)
 * If it is not empty ask the user if they would like to do the following:
 * Deposit Funds
 * Withdraw Funds
 * Check Balance
 * Calculate Interest
 * Delete Account
 * For each of these but delete will call a method in the Account class.
 * You will need to ask for the information here.
 * Delete account sets the index value to Null.
 * Deposit, and Withdraw will return true if the operation is successful
 * and a false if you are unable to complete it. Do not check to see
 * the user entered valid options here, allow the Account class to handle it. *
 * 
 */
public class Account {

  /******************************
   * Variables
   *********************************/
  private String name;
  private double rate;
  private double balance;

  /******************************
   * Constructure
   *********************************/
  public Account(String name, double rate, double balance) {

    this.name = name;
    this.rate = rate;
    this.balance = balance;

  }

  /******************************
   * METHODS
   *********************************/

  public double deposit(double d) {

    if (d > 0.0) {

      this.balance = (this.balance + d);

    } else
      d = 0.0;

    return this.balance;

  }

  public double withdraw(double w) {

    if (w <= 0.0 || w > balance) {
      w = 0.0;
    } else
      this.balance = this.balance - w;

    return this.balance;
  }

  public double getBalance() {

    return this.balance;
  }

  public String getName() {

    return this.name;
  }

  public double applyRate(int m, double rate) {

    if (m > 0 && m < 1000) {

      m = 10 * (m / 12) / 100;

    } else
      rate = 0.0;

    return rate = 100 * (1 + m);

  }

}
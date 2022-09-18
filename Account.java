/**
 * Account
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
  public Account(String name, double rate) {

    this.name = name;
    this.rate = rate;

  }

  /******************************
   * METHODS
   *********************************/

  // Deposit method, returns a boolean

  public boolean deposit(double d) {

    if (d <= 0) {

      return false;

    } else {

      balance += d;
      return true;
    }

  }

  // Withdraw method, if the number is 0 or negative OR number will make balance
  // less than 0, return true or false
  public boolean withdraw(double w) {

    if (w <= 0.0 || (balance - w) < 0) {
      return false;
    } else {
      balance -= w;
    }

    return true;
  }

  //Balance method
  public double getBalance() {

    return this.balance;
  }

  //Account Method
  public String getName() {

    return this.name;
  }


  //Calculate rate method

  public void applyRate(int m) {

    //Math for calculation
    double period = rate * (m/12) / 100;

    //New Value
    balance = balance * (1 + period);


  }

}
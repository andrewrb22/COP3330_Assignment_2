/**
 * Bank
 */
public class Bank {

  //Intance Variable
  private String name;
  private double balance;
  private double interestRate;
  
  //Constructure to take account name and rate
    public Bank(String n , double r){

        this.name = n;
        this.interestRate = r;
    }

    /*
     * Create the following public instance methods:
deposit - takes in a double that will represent the funds that should be deposited.  If the number is 0 or less, you cannot deposit this and return false, otherwise it will add this amount to the balance and return true.   
withdraw - takes in a double that will represent the funds that should be taken from the balance.  If the number is 0 or less or would make the balance less than 0 then you cannot withdraw this amount of funds and return false.  Otherwise, update the balance and return true.
getBalance - returns the balance as a double
getName - returns the name of the account
calcInterest - takes in an integer that will have value from 1-1,000 that represents how many months have passed.  Calculate interest that should be added to the account.  Example: If the balance is $100, interest is 10% and the parameter's value is 6 (months), then the new balance would be $105.00. 

Math:

InterestPeriod = 10*(6/12)/100
newTotal = 100 * (1 + InterestPeriod)
     */

}
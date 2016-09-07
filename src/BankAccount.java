/**
 A bank account has a balance that can be changed by
 deposits and withdrawals.
 */
public class BankAccount
{
    //  instance variables
    public double balance;

    // Constructors
    public BankAccount()
    {
        this(0);
    }

    public BankAccount(double initialBalance)
    {
        this.balance = initialBalance;
    }

    // Methods
    /**
     Deposits money from the bank account.
     @param amount the amount to deposit
     */
    public void deposit(double amount)
    {
        this.balance = this.balance + amount;
    }

    /**
     Withdraws money from the bank account.
     @param amount the amount to withdraw
     */
    public void withdraw(double amount)
    {
        this.balance = this.balance - amount;
    }

    /**
     Gets the current balance of the bank account.
     @return the current balance
     */
    public double getBalance()
    {
        return this.balance;
    }
}

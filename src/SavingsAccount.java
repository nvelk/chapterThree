/**
 * Created by evn on 07/09/2016.
 */
public class SavingsAccount extends BankAccount{
    /**
     Instance variables
     */
    private double interest;

    //Constructors
    public SavingsAccount(double initialBalance, double rate)
    {
        this.balance = initialBalance;
        this.interest = (this.balance * (rate / 100));
    }

    //Methods
    public void addInterest()
    {
        this.balance = this.balance + interest;
    }
}

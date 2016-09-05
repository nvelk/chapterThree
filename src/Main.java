/**
 * Created by evn on 03/09/2016.
 */
public class Main
{
    public static void main (String[] args)
    {
        BankAccount evinAcc = new BankAccount();
        BankAccount cillAcc = new BankAccount(5000);

        System.out.println("Your balance is: " + evinAcc.getBalance());
        System.out.println("Your balance is: " + cillAcc.getBalance());
    }
}

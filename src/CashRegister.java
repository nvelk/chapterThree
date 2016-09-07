/**
 * Created by evn on 06/09/2016.
 */
public class CashRegister {
    /** Instance variables
     *
     */
    public double purchase;
    public double taxPurchase;
    public double payment;
    public double taxRate;
    public double tax;
    public double salesTotal;
    public double salesCount;

    /** Constructors*/
    public CashRegister(double taxRate)
    {
        this.taxRate = taxRate;
    }

    public CashRegister()
    {

    }

    /**
        Records sale of an item
        @param amount the price of the item
     */
    public void recordPurchase(double amount)
    {
        purchase = purchase + amount;
    }
    public void recordTaxPurchase(double amount)
    {
        taxPurchase = taxPurchase + amount;
    }
    public void getTotalTax()
    {
        tax = taxPurchase * (taxRate/100);
    }

    /**
        Enter the payment received
        @param amount the amount of the payment
     */
    public void enterPayment(double amount)
    {
        payment = amount;
    }

    /**
        Computes the change due and resets the machine
        @return the change due to the customer
     */
    public double giveChange()
    {
        getSalesTotal();
        getSalesCount();
        double change = payment - (purchase+taxPurchase+tax);
        purchase = 0;
        payment = 0;
        taxPurchase = 0;
        return change;
    }

    /**
     Totals together all sales
     */
    public void getSalesTotal()
    {
        salesTotal = salesTotal + purchase+taxPurchase+tax;
    }

    /**
     Counts amount of sales
     */
    public void getSalesCount()
    {
        salesCount = salesCount + 1;
    }
    /**
     Resets sales
     */
    public void reset()
    {
        salesCount = 0;
        salesTotal = 0;
    }
}

/**
 * Created by evn on 07/09/2016.
 */
public class Product {
    // instance variables
    public String name;
    public double price;

    // constructors
    public Product(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    // methods
    public String getName()
    {
        return this.name;
    }
    public double getPrice()
    {
        return this.price;
    }
    public void reducePrice(double amount)
    {
        this.price = this.price - amount;
    }
}

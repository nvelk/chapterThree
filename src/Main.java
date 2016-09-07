import javax.swing.*;

/**
 * Created by evn on 03/09/2016.
 */
public class Main
{
    public static void main (String[] args)
    {
        Product p1 = new Product("Printer", 49.99);
        Product p2 = new Product("Ink Cartridge", 7.99);
        String name1 = p1.name;
        String name2 = p2.name;
        System.out.println(name1);
        System.out.println(name2);
        double price1 = p1.price;
        double price2 = p2.price;
        System.out.println(price1);
        System.out.println(price2);
        p1.reducePrice(5);
        p2.reducePrice(5);
        price1 = p1.price;
        price2 = p2.price;
        System.out.println(price1);
        System.out.println(price2);
    }
}

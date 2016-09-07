/**
 * Created by evn on 07/09/2016.
 */
public class Car {
    // instance variables
    public double fuelEfficiency;
    private double fuel;

    // constructors
    public Car(double fuelEfficiency)
    {
        this.fuelEfficiency = fuelEfficiency;
    }

    // methods
    public void drive(double distance)
    {
        fuel = fuel - (distance / fuelEfficiency);
    }
    public double getGasInTank()
    {
        return fuel;
    }
    public void addGas(double gasToAdd)
    {
        fuel = fuel + gasToAdd;
    }
}

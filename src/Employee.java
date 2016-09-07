/**
 * Created by evn on 07/09/2016.
 */
public class Employee {
    /**
     * Instance variables
     */
    public String name;
    public double salary;

    /**
     * Constructors
     */
    public Employee(String employeeName, double currentSalary)
    {
        this.name = employeeName;
        this.salary = currentSalary;
    }
    public Employee()
    {

    }

    /**
     * Methods
     */
    public String getName()
    {
        return this.name;
    }
    public double getSalary()
    {
        return this.salary;
    }
    public void raiseSalary(double byPercent)
    {
        this.salary = this.salary + (this.salary * (byPercent / 100));
    }
}

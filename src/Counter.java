/**
 * Created by evn on 03/09/2016.
 */
public class Counter
{
    private int value;

    public void count()
    {
        value = value + 1;
    }

    public int getValue()
    {
        return value;
    }

    public void reset()
    {
        value = 0;
    }
}

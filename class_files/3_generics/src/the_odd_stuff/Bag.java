package the_odd_stuff;

public class Bag<T extends Comparable>
{
    private T[] data;

    public Bag()
    {
        data = (T[]) new Comparable[10];
    }
}

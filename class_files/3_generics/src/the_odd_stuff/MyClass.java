package the_odd_stuff;

public class MyClass implements MyComparable
{
    @Override
    public boolean foo()
    {
        return false;
    }

    @Override
    public int compareTo(Object o)
    {
        return 0;
    }
}

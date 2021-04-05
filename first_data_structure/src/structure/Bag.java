package structure;

import java.util.Arrays;

public class Bag implements ICollection
{
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] data;

    //track the next available spot
    private int nextUnusedIndex = 0;

    public Bag()
    {
        data = new Object[DEFAULT_CAPACITY];
    }

    public Bag(int capacity)
    {
        if (capacity <= 0)
        {
            throw new IllegalArgumentException("Capacity must be positive");
        }

        data = new Object[capacity];
    }

    @Override
    public boolean add(Object newElement)
    {
        //is the bag full?
        if (nextUnusedIndex >= data.length)
        {
            return false; //not added!
        }

        //otherwise add the element
        data[nextUnusedIndex] = newElement;
        nextUnusedIndex++;

        return true; //added!
    }

    @Override
    public boolean contains(Object element)
    {
        return false;
    }

    @Override
    public boolean remove(Object element)
    {
        return false;
    }

    @Override
    public int size()
    {
        return nextUnusedIndex;
    }

    public int getCapacity()
    {
        return data.length;
    }

    @Override
    public boolean isEmpty()
    {
        return nextUnusedIndex == 0;
    }

    @Override
    public String toString()
    {
        return "Data: " + Arrays.toString(data);
    }
}

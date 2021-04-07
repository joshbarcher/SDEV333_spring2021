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
        for (int i = 0; i < data.length; i++)
        {
            if (data[i] != null && data[i].equals(element))
            {
                return true;
            }
        }
        return false;
    }

    /*
        Scenarios:
        #1 - What if the element is in the bag multiple times?
        #2 - What if not there...
        #3 - What if it is there...
        #4 - Empty bag
        #5 - Full bag
     */
    @Override
    public boolean remove(Object element)
    {
        //the bag is empty
        if (nextUnusedIndex == 0)
        {
            return false;
        }

        //loop over all elements
        for (int i = 0; i < nextUnusedIndex; i++)
        {
            //did we find it?
            if (data[i].equals(element))
            {
                //remove the element, shifting down higher elements
                for (int j = i; j < nextUnusedIndex - 1; j++)
                {
                    data[j] = data[j + 1];
                }
                nextUnusedIndex--; //???
                data[nextUnusedIndex] = null;

                //stop searching...
                return true;
            }
        }

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

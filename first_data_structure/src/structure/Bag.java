package structure;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class Bag<T> implements ICollection<T>
{
    private static final int DEFAULT_CAPACITY = 10;
    private T[] data;

    //track the next available spot
    private int nextUnusedIndex = 0;

    //track changes to the structure with a number
    private int modCount;

    public Bag()
    {
        data = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public Bag(int capacity)
    {
        if (capacity <= 0)
        {
            throw new IllegalArgumentException("Capacity must be positive");
        }

        data = (T[]) new Object[capacity];
    }

    @Override
    public boolean add(T newElement)
    {
        //is the bag full?
        if (nextUnusedIndex >= data.length)
        {
            return false; //not added!
        }

        //otherwise add the element
        data[nextUnusedIndex] = newElement;
        nextUnusedIndex++;
        modCount++; //a change was made

        return true; //added!
    }

    @Override
    public boolean contains(T element)
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
    public boolean remove(T element)
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
                nextUnusedIndex--;
                data[nextUnusedIndex] = null;
                modCount++;

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

    @Override
    public Iterator<T> iterator()
    {
        return new BagIterator();
    }

    private class BagIterator implements Iterator<T>
    {
        //this is the index that will next be returned by the iterator
        private int nextIndex = 0;
        private int savedModCount;

        public BagIterator()
        {
            //assign the field in the inner class to the outer class field
            savedModCount = modCount;
        }

        @Override
        public boolean hasNext()
        {
            checkForConcurrentChanges();

            //make sure we still have a valid index and the value is not null
            return nextIndex < nextUnusedIndex;
        }

        private void checkForConcurrentChanges()
        {
            if (savedModCount != modCount)
            {
                throw new ConcurrentModificationException(
                        "You cannot change the Bag while iterating");
            }
        }

        @Override
        public T next()
        {
            checkForConcurrentChanges();

            //save the next element seen by the iterator, move to the next element, return our result
            return data[nextIndex++];
        }
    }
}















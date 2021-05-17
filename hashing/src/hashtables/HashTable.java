package hashtables;

import java.util.Arrays;

public class HashTable<T>
{
    private static final int INITIAL_TABLE_SIZE = 10;
    private static final double MAX_LOAD_FACTOR = 0.6;
    private static final int RESIZE_RATE = 2;

    private T[] table;
    private int size;

    public HashTable()
    {
        table = (T[]) new Object[INITIAL_TABLE_SIZE];
    }

    public boolean add(T element)
    {
        //check if our load factor is too large...
        if (((double)size + 1) / table.length >= MAX_LOAD_FACTOR)
        {
            resize();
        }

        //a numeric value that is generated from the properties of the Object...
        int code = Math.abs(element.hashCode());
        int index = code % table.length;

        //probe to find a good position in the table
        while (table[index] != null)
        {
            //check if a duplicate
            if (table[index].equals(element))
            {
                return false; //don't support duplicates!
            }

            //otherwise we need to move to the next index
            index = (index + 1) % table.length;
        }

        table[index] = element;
        size++;
        return true;
    }

    private void resize()
    {
        System.out.println("Table was resized");

        //create a new array (double the size) and copy
        //all elements over to the new array
        T[] oldTable = table;
        table = (T[]) new Object[oldTable.length * RESIZE_RATE];

        //set size to zero so we don't overcount when re-adding elements below
        size = 0;

        for (int i = 0; i < oldTable.length; i++)
        {
            if (oldTable[i] != null)
            {
                //reuse our code for adding elements into the table
                add(oldTable[i]);
            }
        }
    }

    @Override
    public String toString()
    {
        return Arrays.toString(table);
    }
}

package hashtables;

public class HashTable
{
    public static final int INITIAL_TABLE_SIZE = 10;
    private Object[] table;
    private int size;

    public HashTable()
    {
        table = new Object[INITIAL_TABLE_SIZE];
    }

    public boolean add(Object element)
    {
        if (size == table.length)
        {
            resize();
        }

        //a numeric value that is generated from the properties of the Object...
        int code = Math.abs(element.hashCode());
        int index = code % table.length;
        table[index] = element;
        size++;
        return true;
    }

    private void resize()
    {
        //create a new array (double the size) and copy
        //all elements over to the new array
        Object[] oldTable = table;
        table = new Object[oldTable.length * 2];

        for (int i = 0; i < oldTable.length; i++)
        {
            table[i] = oldTable[i];
        }

        //done!
    }
}

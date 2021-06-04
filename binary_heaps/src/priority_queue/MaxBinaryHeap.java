package priority_queue;

public class MaxBinaryHeap<T extends Comparable<T>> implements IPriorityQueue<T>
{
    public static final int INITIAL_HEAP_SIZE = 10;
    private T[] heap;
    private int nextUnusedIndex = 1;

    public MaxBinaryHeap()
    {
        heap = (T[])new Comparable[INITIAL_HEAP_SIZE];
    }

    @Override
    public void add(T element)
    {
        //what if we have no room for the new element
        if (nextUnusedIndex == heap.length)
        {
            resize();
        }

        heap[nextUnusedIndex] = element;
        swim(nextUnusedIndex);
        nextUnusedIndex++;
    }

    @Override
    public void add(T... elements)
    {
        for (T element : elements)
        {
            add(element);
        }
    }

    private void swim(int currentIndex)
    {
        //loop as long as we have a parent index
        while (currentIndex > 1)
        {
            int parentIndex = currentIndex / 2;

            if (heap[currentIndex].compareTo(heap[parentIndex]) > 0)
            {
                swap(parentIndex, currentIndex);
            }
            else
            {
                break; //short-circuit, the heap is ordered!
            }

            //move the current index to the parent index
            currentIndex = parentIndex;
        }
    }

    private void swap(int first, int second)
    {
        //swap the elements at the input indices in the heap array
        T temp = heap[first];
        heap[first] = heap[second];
        heap[second] = temp;
    }

    private void resize()
    {
        //TODO later...
    }

    @Override
    public T remove()
    {
        return null;
    }

    @Override
    public T peek()
    {
        return null;
    }

    @Override
    public int size()
    {
        return nextUnusedIndex - 1;
    }

    @Override
    public boolean isEmpty()
    {
        return nextUnusedIndex == 1;
    }

    @Override
    public void clear()
    {

    }
}

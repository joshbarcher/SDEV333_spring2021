package priority_queue;

public interface IPriorityQueue<T extends Comparable<T>>
{
    //add a new element to the heap
    void add(T element);
    void add(T... elements);

    //remove and return the min/max element (most important)
    T remove();

    //return the min/max element
    T peek();

    int size();
    boolean isEmpty();
    void clear();
}

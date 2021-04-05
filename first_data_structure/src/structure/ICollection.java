package structure;

public interface ICollection
{
    boolean add(Object newElement);
    boolean contains(Object element);
    boolean remove(Object element);
    int size();
    boolean isEmpty();
}

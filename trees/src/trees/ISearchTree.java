package trees;

public interface ISearchTree<T extends Comparable<T>>
{
    //basic methods for inserting and searching
    boolean add(T element);
    boolean contains(T element);
    boolean remove(T element);
    int size();
    boolean isEmpty();
    void clear();

    //other (interesting) methods
    T min();
    T max();
    ISearchTree<T> prune(T newRoot);
    int treeHeight();
    void invert(); //insert meme here...
}

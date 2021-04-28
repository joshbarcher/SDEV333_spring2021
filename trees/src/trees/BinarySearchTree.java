package trees;

public class BinarySearchTree<T extends Comparable<T>> implements ISearchTree<T>
{
    //fields
    private Node root;
    private int size;
    private int modCount;

    //constructor(s)
    public BinarySearchTree()
    {
        //do nothing...
    }

    //methods

    @Override
    public boolean add(T element)
    {
        //is the tree empty?
        if (root == null)
        {
            root = new Node(element, null, null);
            size++;
            modCount++;
            return true;
        }
        else //not empty?
        {
            //recursively move down the tree and try to add the new element
            return add(root, element);
        }
    }

    private boolean add(Node current, T element)
    {
        //is this a duplicate?
        int comparison = current.data.compareTo(element);
        if (comparison == 0)
        {
            return false;
        }
        //otherwise search to the left
        else if (comparison > 0)
        {

        }
        //otherwise search to the right
        else
        {

        }
        return false;
    }

    @Override
    public boolean contains(T element)
    {
        return false;
    }

    @Override
    public boolean remove(T element)
    {
        return false;
    }

    @Override
    public int size()
    {
        return 0;
    }

    @Override
    public boolean isEmpty()
    {
        return false;
    }

    @Override
    public void clear()
    {

    }

    @Override
    public T min()
    {
        return null;
    }

    @Override
    public T max()
    {
        return null;
    }

    @Override
    public ISearchTree<T> prune(T newRoot)
    {
        return null;
    }

    @Override
    public int treeHeight()
    {
        return 0;
    }

    @Override
    public void invert()
    {

    }

    //nested classes

    private class Node
    {
        private T data;
        private Node left;
        private Node right;

        public Node(T data, Node left, Node right)
        {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString()
        {
            String leftChild = left == null ? "null" : left.data.toString();
            String rightChild = right == null ? "null" : right.data.toString();

            return leftChild + " <-- " + data.toString() + " --> " + rightChild;
        }
    }
}

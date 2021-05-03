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
            int oldSize = size; //save it!
            root = add(root, element);
            return oldSize != size;
        }
    }

    private Node add(Node current, T element)
    {
        //is this a null reference? then we found a spot for the element
        if (current == null)
        {
            size++;
            modCount++;
            return new Node(element, null, null);
        }

        int comparison = current.data.compareTo(element);
        if (comparison > 0)
        {
            current.left = add(current.left, element);
        }
        //otherwise search to the right
        else if (comparison < 0)
        {
            current.right = add(current.right, element);
        }

        //return current if there is a duplicate, or otherwise
        return current;
    }

    @Override
    public boolean contains(T element)
    {
        return contains(root, element);
    }

    private boolean contains(Node current, T element)
    {
        if (current == null)
        {
            return false;
        }

        int comparison = current.data.compareTo(element);
        if (comparison == 0)
        {
            return true;
        }
        else if (comparison > 0)
        {
            return contains(current.left, element);
        }
        //otherwise search to the right
        else
        {
            return contains(current.right, element);
        }
    }

    @Override
    public int size()
    {
        return size;
    }

    @Override
    public boolean isEmpty()
    {
        return size == 0;
    }

    @Override
    public boolean remove(T element)
    {
        return false;
    }

    @Override
    public void clear()
    {
        root = null;
        size = 0;
        modCount++;
    }

    @Override
    public T min()
    {
        return min(root);
    }

    private T min(Node current)
    {
        if (current == null)
        {
            return null;
        }
        else if (current.left == null)
        {
            return current.data;
        }
        return min(current.left);
    }

    @Override
    public T max()
    {
        return max(root);
    }

    private T max(Node current)
    {
        if (current == null)
        {
            return null;
        }
        else if (current.right == null)
        {
            return current.data;
        }
        return max(current.right);
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

package trees.balanced;

import trees.random.BinarySearchTree;

public class TestBalancedTree
{
    public static void main(String[] args)
    {
        BalancedBST<Integer> numTree = new BalancedBST<>();

        for (int i = 0; i < 100000; i++)
        {
            numTree.add(i);
        }

        System.out.println(numTree.treeHeight());
    }
}

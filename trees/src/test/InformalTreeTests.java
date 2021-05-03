package test;

import trees.BinarySearchTree;

import java.util.List;

public class InformalTreeTests
{
    public static void main(String[] args)
    {
        BinarySearchTree<Integer> treeOfNums = new BinarySearchTree<>();

        treeOfNums.add(24);
        treeOfNums.add(23);
        treeOfNums.add(42);
        treeOfNums.add(80);
        treeOfNums.add(-3);
        treeOfNums.add(13);
        treeOfNums.add(120);

        System.out.println(treeOfNums.contains(120));

        //practice using a traversal
        /*List<Integer> results = treeOfNums.preOrder();
        for (int element : results)
        {
            System.out.println(element);
        }*/

        //we should also have an iterator to use
        for (int element : treeOfNums)
        {
            System.out.println(element);
        }
        System.out.println();

        //BFS traversal
        List<Integer> results = treeOfNums.bfs();
        for (int element : results)
        {
            System.out.println(element);
        }
    }
}

package test;

import trees.BinarySearchTree;

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
    }
}

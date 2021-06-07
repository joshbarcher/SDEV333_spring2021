package test;

import priority_queue.MaxBinaryHeap;

public class QueueDriver
{
    public static void main(String[] args)
    {
        MaxBinaryHeap<Integer> heapOfInts = new MaxBinaryHeap<>();
        heapOfInts.add(6, 13, 28, 11, 19, -4, 999, 11, 42, 15, 11, 27);
        System.out.println("Size of heap: " + heapOfInts.size());
        System.out.println();

        while (!heapOfInts.isEmpty())
        {
            System.out.println(heapOfInts.remove());
        }
    }
}

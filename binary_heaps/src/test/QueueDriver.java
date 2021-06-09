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

        //empty the heap by removing elements repeatedly
        while (!heapOfInts.isEmpty())
        {
            System.out.println(heapOfInts.remove());
        }

        //manually insert elements (logn per add() call, so n * logn in total)
        MaxBinaryHeap<Double> heapExample = new MaxBinaryHeap<>();
        double[] array = {2.2, 18.5, 4.7, 24.9, 3.14, -8.5, 4.2};
        for (int i = 0; i < array.length; i++)
        {
            heapExample.add(array[i]);
        }

        //build heap routine
        MaxBinaryHeap<Double> heapOfDoubles = new MaxBinaryHeap<>(2.2, 18.5, 4.7, 24.9, 3.14, -8.5, 4.2);
        System.out.println(heapOfDoubles);
    }
}

package test;

import priority_queue.MaxBinaryHeap;

public class QueueDriver
{
    public static void main(String[] args)
    {
        MaxBinaryHeap<Integer> heapOfInts = new MaxBinaryHeap<>();
        heapOfInts.add(6, 13, 28, 11, 19, -4, 999);
    }
}

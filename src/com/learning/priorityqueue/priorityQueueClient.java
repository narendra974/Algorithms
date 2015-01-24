package com.learning.priorityqueue;

public class priorityQueueClient {

	public static void main(String[] args) 
	{
		{
			UnorderedPQ<String> priorityQueue = new UnorderedPQ<String>(10);
			priorityQueue.insert("P");
			priorityQueue.insert("Q");
			priorityQueue.insert("E");
			priorityQueue.delMax();
			
			priorityQueue.insert("X");
			priorityQueue.insert("A");
			priorityQueue.insert("M");
			priorityQueue.delMax();
			
			priorityQueue.insert("P");
			priorityQueue.insert("L");
			priorityQueue.insert("E");
			priorityQueue.delMax();
			
			// Should print E M A P L E
			System.out.println(" --------- UNORDERED PRIORITY QUEUE START -------- ");
			while(!priorityQueue.isEmpty())
			{
				System.out.print(priorityQueue.delMax() + " ");
			}
			System.out.println();
			System.out.println(" --------- UNORDERED PRIORITY QUEUE END   -------- ");
		}
		
		{
			BinaryHeapPriorityQueue<String> priorityQueue = new BinaryHeapPriorityQueue<String>(10);
			priorityQueue.insert("P");
			priorityQueue.insert("Q");
			priorityQueue.insert("E");
			priorityQueue.delMax();
			
			priorityQueue.insert("X");
			priorityQueue.insert("A");
			priorityQueue.insert("M");
			priorityQueue.delMax();
			
			priorityQueue.insert("P");
			priorityQueue.insert("L");
			priorityQueue.insert("E");
			priorityQueue.delMax();
			
			// Should print E M A P L E
			System.out.println(" --------- BINARY HEAP PRIORITY QUEUE START -------- ");
			while(!priorityQueue.isEmpty())
			{
				System.out.print(priorityQueue.delMax() + " ");
			}
			System.out.println();
			System.out.println(" --------- BINARY HEAP PRIORITY QUEUE END   -------- ");
		}
	}

}

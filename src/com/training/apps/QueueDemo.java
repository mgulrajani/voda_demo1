package com.training.apps;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
public static void main(String[] args) {
	
	Queue<Integer> queue= new PriorityQueue<>();
     queue.add(121);
     List<Integer> list1 = List.of(34,45,65,32,12,23,33,44);
     queue.addAll(list1);
     
     System.out.println(queue);
     System.out.println(queue.poll());
     System.out.println(queue);
	
	queue.offer(100);
	System.out.println(queue);

     System.out.println(queue.peek());
     System.out.println(queue);

}
}

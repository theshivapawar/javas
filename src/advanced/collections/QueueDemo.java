package advanced.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>();
//        queue.add("c");
//        queue.add("a");
//        queue.add("b");
//        queue.offer("d");
        // (rear) <- d - b - a - c -> (front)

        System.out.println(queue);

        // return null if the queue is empty
        System.out.println(queue.peek());

        // throws exception if the queue is empty
        //System.out.println(queue.element());

        // remove the item at front and return it
        // if the queue is empty, throws an exception
        //System.out.println(queue.remove());

        // returns null if queue is empty
        System.out.println(queue.poll());

        System.out.println(queue);
    }
}

/*
* Difference between add & offer
* depends on the implementation of queue we are using
* ArrayDeque - no difference
* some implementations
* - the queue might have limited size
* - if the queue gets full, add method throws an exception
* - offer method throws false
* */
package com.company;

public class Main {

    public static void main(String[] args) {
    //Using the Queue class will be demonstrated here


        Queue queue = new Queue(5); //Setting the max size for the queue

        //Inserting numbers into the queue
        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);
        queue.enqueue(400);
        queue.enqueue(500);

        //Returning the front most number in the queue
        System.out.println(queue.peek());


        //Removing some items
        queue.dequeue();
        queue.dequeue();


        //Displaying the items in the queue
        while(!queue.empty()) {
            int number = queue.dequeue();
            System.out.print(number + "  ");
        }
    }
}

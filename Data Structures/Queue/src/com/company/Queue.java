package com.company;

//Queue methods will be implemented here
//First In First Out

public class Queue {

    private int max; //Max size of the Queue
    private int array[];
    private int elements; //Number of elements in the Queue
    private int front; //Front of the queue
    private int back; //Back of the queue


    public Queue(int m){
        max = m;
        array = new int[max];
        elements = 0;
        front = 0;
        back = -1;
    }

    //since FIFO, items will be inserted in the back
    public void enqueue(int n){
        if(back == max - 1){  //Since there is an issue with wraparound, this will deal with it
            back = -1;
        }
        array[++back] = n; //Inserting items in the back
        elements++;  //Increasing the number of elements as each new item is inserted
    }

    //This will take the item from the front and remove it
    public int dequeue(){
        int item = array[front++];  //This will get the value of the item that it is trying to remove then it will increment onto the next value
        if(front == max){  //Dealing with the issue of wraparound
            front = 0;
        }
        elements--; //Since items are being removed, this will be decremented each time
        return item;
    }

    //This will peek in front of the queue
    public int peek(){
        return array[front];
    }

    //Checks whether or not the queue is empty
    public boolean empty(){
        return (elements == 0);
    }

    //Checks whether or not the queue is full
    public boolean full(){
        return (elements == max);
    }
}

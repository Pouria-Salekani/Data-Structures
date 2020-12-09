package com.company;

//This is where Stack methods will be implemented
//Top to bottom approach

public class Stack {

    private int max; //Max size of the array that'll be used with Stack
    private int array[];
    private int top; //This will store the top value of the stack

    public Stack(int m){
        max = m;
        array = new int[max];
        top = -1; //this is -1 because there are no values yet, will be incremented as more values are added
    }

    //Value will be inserted into ++top position
    public void push(int p){
        array[++top] = p;
    }

    //Returns top most value then decrements as pop() keeps on getting called
    public int pop(){
        return array[top--];
    }

    //Will return the top most value
    public int peek(){
        return array[top];
    }

    //Checks to see if the Stack is empty or not
    public boolean empty(){
        return (top == -1);
    }

    //Checks to see if the Stack is full or not
    public boolean full(){
        return (top == max - 1);
    }
}

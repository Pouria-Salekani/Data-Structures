package com.company;

public class Main {

    public static void main(String[] args) {
        //Stack will be used here

        Stack stack = new Stack(10); //Setting the max size of the Stack
        //Pushing numbers into the Stack
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);
        stack.push(500);

        //Will be displaying the values in the Stack
        while(!stack.empty()){
            int numbers = stack.pop();
            System.out.print(numbers + "  ");
        }
    }
}

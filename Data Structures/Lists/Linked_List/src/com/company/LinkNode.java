package com.company;

public class LinkNode {

    LinkNode next; //This will be used to access the next item in the list
    int data;

    public LinkNode(int d){
        data = d;
    }

    //Will be used to display an item in the list
    public void displayItem() {
        System.out.print(data + "  ");
    }
}

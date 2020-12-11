package com.company;

public class LinkedList {

    private LinkNode first; //Referencing the first item/link in the list

    //Initialization
    public LinkedList() {
        first = null;
    }

    //Will be inserting items at the start of the list
    public void insert(int d){
        LinkNode linkNode = new LinkNode(d);
        linkNode.next = first;
        first = linkNode;
    }

    //Deletes the first item in the list
    public LinkNode delete(){
        LinkNode del = first;
        first = first.next;
        return del;
    }

    //Will display the whole list
    public void displayList(){
        LinkNode current = first;
        while(current != null){
            current.displayItem(); //Displays the current item
            current = current.next; //After it displays the current item, it moves on
        }
    }

    //Checks whether or not the list is empty
    public boolean empty(){
        return (first == null);
    }
}

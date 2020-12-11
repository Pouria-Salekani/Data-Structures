package com.company;

public class Main {

    public static void main(String[] args) {
	//Utilizing the LinkNode and LinkedList class will be demonstrated here

        LinkedList linkedList = new LinkedList();
        linkedList.insert(33);
        linkedList.insert(55);
        linkedList.insert(77);
        linkedList.insert(99);

        linkedList.displayList(); //Displaying before deletion

        System.out.println();

        //Will loop through and delete each link in the list
        while(!linkedList.empty()){
           LinkNode removedLink = linkedList.delete();
           System.out.print("Removed link: ");
           removedLink.displayItem();
        }
    }
}

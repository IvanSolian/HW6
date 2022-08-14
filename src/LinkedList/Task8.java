package LinkedList;

import java.util.LinkedList;

public class Task8 {
    public static void main(String[] args) {


        LinkedList<String> linkedListlist = new LinkedList<String>();
        linkedListlist.add("Blue");
        linkedListlist.add("Green");
        linkedListlist.add("Red");
        linkedListlist.add("Yellow");
        System.out.println("Normal linked list:" + linkedListlist);
        linkedListlist.offerLast("Red");
        System.out.println("Linked list modified" + linkedListlist);
    }
}
//8. Write a Java program to insert the specified element at the end of a linked list.

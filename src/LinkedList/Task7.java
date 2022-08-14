package LinkedList;

import java.util.LinkedList;

public class Task7 {
    public static void main(String[] args) {


        LinkedList<String> linkedListlist = new LinkedList<String>();
        linkedListlist.add("Blue");
        linkedListlist.add("Green");
        linkedListlist.add("Red");
        linkedListlist.add("Yellow");
        System.out.println("Normal linked list:" + linkedListlist);
        linkedListlist.offerFirst("Green");
        System.out.println("Linked list propouse first color"+linkedListlist);
    }
}
//7. Write a Java program to insert the specified element at the front of a linked list.
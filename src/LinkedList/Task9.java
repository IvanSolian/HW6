package LinkedList;

import java.util.LinkedList;

public class Task9 {
    public static void main(String[] args) {
        LinkedList<String> linkedListlist = new LinkedList<String>();
        linkedListlist.add("Blue");
        linkedListlist.add("Green");
        linkedListlist.add("Red");
        linkedListlist.add("Yellow");
        System.out.println("Normal linked list:" + linkedListlist);
        linkedListlist.add(1,"Pink");
        linkedListlist.add(2,"Gray");

        System.out.println("Linked list"+ linkedListlist);
    }
}
//9. Write a Java program to insert some elements at the specified position into a linked list.
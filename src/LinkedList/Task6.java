package LinkedList;

import java.util.LinkedList;

public class Task6 {
    public static void main(String[] args) {

        LinkedList<String> linkedListlist = new LinkedList<String>();
        linkedListlist.add("Blue");
        linkedListlist.add("Green");
        linkedListlist.add("Red");
        linkedListlist.add("Yellow");
        System.out.println("Normal linked list:" + linkedListlist);
        linkedListlist.addFirst("Pink");
        linkedListlist.addLast("Black");
        System.out.println("Linked list after add Pink and White"+linkedListlist);
}
}
//6. Write a Java program to insert elements into the linked list at the first and last position.

package LinkedList;

import java.util.LinkedList;

public class Task5 {
    public static void main(String[] args) {
        LinkedList<String> linkedListlist = new LinkedList<String>();
        linkedListlist.add("Blue");
        linkedListlist.add("Green");
        linkedListlist.add("Red");
        linkedListlist.add("Yellow");
        System.out.println("Normal linked list:" + linkedListlist);
        linkedListlist.add(2,"Pink");
        System.out.println("The linked list after add color:" + linkedListlist);
    }
}
//5. Write a Java program to insert the specified element at the specified position in the linked list.
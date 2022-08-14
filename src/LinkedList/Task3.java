package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Task3 {
    public static void main(String[] args) {
        LinkedList<String> linkedListlist = new LinkedList<String>();
        linkedListlist.add("Blue");
        linkedListlist.add("Green");
        linkedListlist.add("Red");
        linkedListlist.add("Yellow");
        Iterator n = linkedListlist.listIterator(2);
        while (n.hasNext()) {
            System.out.println(n.next());
        }
    }
}
//3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
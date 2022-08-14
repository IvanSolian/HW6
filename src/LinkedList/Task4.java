package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Task4 {
    public static void main(String[] args) {

        LinkedList<String> linkedListlist = new LinkedList<String>();
        linkedListlist.add("Blue");
        linkedListlist.add("Green");
        linkedListlist.add("Red");
        linkedListlist.add("Yellow");
        System.out.println("Normal linked list:" + linkedListlist);
        Iterator it = linkedListlist.descendingIterator();
        System.out.println("Reverse Order:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
//4. Write a Java program to iterate a linked list in reverse order.
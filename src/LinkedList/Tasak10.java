package LinkedList;

import java.util.LinkedList;

public class Tasak10 {
    public static void main(String[] args) {
        LinkedList<String> linkedListlist = new LinkedList<String>();
        linkedListlist.add("Blue");
        linkedListlist.add("Green");
        linkedListlist.add("Red");
        linkedListlist.add("Yellow");
        System.out.println("Normal linked list:" + linkedListlist);
        Object first_element = linkedListlist.getFirst();
        System.out.println("First Element is: "+first_element);
        Object last_element = linkedListlist.getLast();
        System.out.println("Last Element is: "+last_element);
    }
}

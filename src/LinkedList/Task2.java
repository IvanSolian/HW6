package LinkedList;

import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {

        LinkedList<String> linkedListlist = new LinkedList<String>();
        linkedListlist.add("Blue");
        linkedListlist.add("Green");
        linkedListlist.add("Red");
        linkedListlist.add("Yellow");
        for (String element: linkedListlist){
            System.out.println(element);
        }
    }
}
//2. Write a Java program to iterate through all elements in a linked list.
package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet4 {
    public static void main(String[] args) {
        TreeSet<String> color_tree_set = new TreeSet<String>();
        color_tree_set.add("Blue");
        color_tree_set.add("Orange");
        color_tree_set.add("White");
        color_tree_set.add("Green");
        color_tree_set.add("Gray");
        System.out.println("Standart tree set:" + color_tree_set);
        Iterator iter = color_tree_set.descendingIterator();
        System.out.println("Colors in Reverse Order:");
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }
}
//4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
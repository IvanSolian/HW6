package TreeSet;

import java.util.TreeSet;

public class TreeSet2 {
    public static void main(String[] args) {
        TreeSet<String> color_tree_set = new TreeSet<String>();
        color_tree_set.add("Blue");
        color_tree_set.add("Orange");
        color_tree_set.add("White");
        color_tree_set.add("Green");
        color_tree_set.add("Gray");
        for (String element : color_tree_set) {
            System.out.println(element);
        }
    }
}
//2. Write a Java program to iterate through all elements in a tree set.

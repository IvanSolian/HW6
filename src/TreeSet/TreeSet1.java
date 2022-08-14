package TreeSet;

import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<String> color_tree_set = new TreeSet<String>();
        color_tree_set.add("Blue");
        color_tree_set.add("Orange");
        color_tree_set.add("White");
        color_tree_set.add("Green");
        color_tree_set.add("Gray");
        System.out.println(color_tree_set);
    }
}
//1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
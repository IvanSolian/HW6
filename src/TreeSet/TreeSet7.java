package TreeSet;

import java.util.TreeSet;

public class TreeSet7 {
    public static void main(String[] args) {
        TreeSet<String> color_tree_set = new TreeSet<String>();
        color_tree_set.add("Blue");
        color_tree_set.add("Orange");
        color_tree_set.add("White");
        color_tree_set.add("Green");
        color_tree_set.add("Gray");
        System.out.println("TreeSet : " + color_tree_set);
        System.out.println("Size of the tree set: " + color_tree_set.size());
    }
}
//7. Write a Java program to get the number of elements in a tree set.
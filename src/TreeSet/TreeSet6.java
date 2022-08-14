package TreeSet;

import java.util.TreeSet;

public class TreeSet6 {
    public static void main(String[] args) {

        TreeSet<String> color_tree_set = new TreeSet<String>();
        color_tree_set.add("Blue");
        color_tree_set.add("Orange");
        color_tree_set.add("White");
        color_tree_set.add("Green");
        color_tree_set.add("Gray");
        System.out.println("Original tree set:" + color_tree_set);
        TreeSet<String> new_t_set = (TreeSet<String>)color_tree_set.clone();
        System.out.println("Cloned tree list: " + color_tree_set);
    }
}
//6. Write a Java program to clone a tree set list to another tree set.

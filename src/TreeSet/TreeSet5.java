package TreeSet;

import java.util.TreeSet;

public class TreeSet5 {
    public static void main(String[] args) {

        TreeSet<String> color_tree_set = new TreeSet<String>();
        color_tree_set.add("Blue");
        color_tree_set.add("Orange");
        color_tree_set.add("White");
        color_tree_set.add("Green");
        color_tree_set.add("Gray");
        System.out.println("Tree set:" + color_tree_set);
        Object first_color = color_tree_set.first();
        Object last_color = color_tree_set.last();
        System.out.println("First color " + first_color);
        System.out.println("Last color "+ last_color);
    }
}
//5. Write a Java program to get the first and last elements in a tree set.
package TreeSet;

import java.util.TreeSet;

public class TreeSet10 {
    public static void main(String[] args) {
        TreeSet<Integer> tree_set_num = new TreeSet<Integer>();
        TreeSet <Integer>treeheadset = new TreeSet<Integer>();
        tree_set_num.add(7);
        tree_set_num.add(17);
        tree_set_num.add(27);
        tree_set_num.add(37);
        tree_set_num.add(47);
        tree_set_num.add(57);
        tree_set_num.add(67);
        tree_set_num.add(77);
        tree_set_num.add(87);

        System.out.println("Greater than or equal to 50 : "+tree_set_num.ceiling(70));
        System.out.println("Greater than or equal to 29 : "+tree_set_num.ceiling(50));
    }
}
//10. Write a Java program to get the element in a tree set which is greater than or equal to the given element.
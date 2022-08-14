package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet9 {
    public static void main(String[] args) {
        TreeSet <Integer>tree_set_num = new TreeSet<Integer>();
        TreeSet <Integer>treeheadset = new TreeSet<Integer>();
        tree_set_num.add(1);
        tree_set_num.add(2);
        tree_set_num.add(3);
        tree_set_num.add(5);
        tree_set_num.add(6);
        tree_set_num.add(7);
        tree_set_num.add(8);
        tree_set_num.add(9);
        tree_set_num.add(10);

        treeheadset = (TreeSet)  tree_set_num.headSet(7);
        Iterator iterator;
        iterator = treeheadset.iterator();
        System.out.println("Tree set: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
    }
}
//9. Write a Java program to find the numbers less than 7 in a tree set.
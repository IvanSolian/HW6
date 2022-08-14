package TreeSet;

import java.util.TreeSet;

public class TreeSet3 {
    public static void main(String[] args) {
        TreeSet<String > set1 = new TreeSet<String>();
        set1.add("white");
        set1.add("black");
        TreeSet<String> set2 = new TreeSet<String>();
        set2.add("green");
        set2.add("yellow");
        TreeSet<String> set3 = new TreeSet<String>();
        set3.add("pink");
        set3.add("gray");
        System.out.println("TreeSet1: "+ set2);
        System.out.println("TreeSet2: "+ set2);
        System.out.println("TreeSet3: "+ set3);
    }
}
//3. Write a Java program to add all the elements of a specified tree set to another tree set.
package TreeSet;

import java.util.TreeSet;

public class TreeSet8 {
    public static void main(String[] args) {
        TreeSet<String > set1 = new TreeSet<String>();
        set1.add("white");
        set1.add("black");
        set1.add("green");
        System.out.println("TreeSet1: "+ set1);
        TreeSet<String> set2 = new TreeSet<String>();
        set2.add("yellow");
        set2.add("pink");
        set2.add("gray");
        System.out.println("TreeSet2: "+ set2);
        TreeSet<String> result_set = new TreeSet<String>();
        for (String element : set1){
            System.out.println(set2.contains(element) ? "Yes" : "No");
        }
    }
}
//8. Write a Java program to compare two tree sets.
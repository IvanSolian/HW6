package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {
    public static void main(String[] args) {
        HashSet<String> color_hash_set = new HashSet<String>();
        color_hash_set.add("Blue");
        color_hash_set.add("Orange");
        color_hash_set.add("White");
        color_hash_set.add("Green");
        color_hash_set.add("Gray");
        System.out.println("HashSet : " + color_hash_set);
        Iterator<String> i = color_hash_set.iterator();
        // Iterate the hash set
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
//2. Write a Java program to iterate through all elements in a hash list.

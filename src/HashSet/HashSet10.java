package HashSet;

import java.util.HashSet;

//10. Write a Java program to compare two hash set.
public class HashSet10 {
    public static void main(String[] args) {
        HashSet<String> color_hash_set1 = new HashSet<String>();
        color_hash_set1.add("Blue");
        color_hash_set1.add("Orange");
        color_hash_set1.add("White");
        HashSet<String> color_hash_set2 = new HashSet<String>();
        color_hash_set2.add("Green");
        color_hash_set2.add("Gray");
        color_hash_set2.add("Red");
        HashSet<String> result_set = new HashSet<String>();
        for (String element : color_hash_set1) {
            System.out.println(color_hash_set2.contains(element) ? "Yes" : "No");

        }
    }
}

package HashSet;

import java.util.HashSet;

;

public class HashSet1 {
    public static void main(String[] args) {

        HashSet<String> color_hash_set = new HashSet<String>();
        color_hash_set.add("Blue");
        color_hash_set.add("Orange");
        color_hash_set.add("White");
        color_hash_set.add("Green");
        color_hash_set.add("Gray");
        System.out.println("HashSet : "+ color_hash_set);
    }
}
//1. Write a Java program to append the specified element to the end of a hash set.
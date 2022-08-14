package HashSet;

import java.util.HashSet;

public class HashSet3 {
    public static void main(String[] args) {

        HashSet<String> color_hash_set = new HashSet<String>();
        color_hash_set.add("Blue");
        color_hash_set.add("Orange");
        color_hash_set.add("White");
        color_hash_set.add("Green");
        color_hash_set.add("Gray");
        System.out.println("Normal HashSet : " + color_hash_set);
        System.out.println("Size of the Hash Set: " + color_hash_set.size());
    }
    }
//3. Write a Java program to get the number of elements in a hash set.

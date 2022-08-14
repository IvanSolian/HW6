package HashSet;

import java.util.HashSet;

public class HashSet4 {
    public static void main(String[] args) {


        HashSet<String> color_hash_set = new HashSet<String>();
        color_hash_set.add("Blue");
        color_hash_set.add("Orange");
        color_hash_set.add("White");
        color_hash_set.add("Green");
        color_hash_set.add("Gray");
        System.out.println("Normal HashSet : " + color_hash_set);
        color_hash_set.removeAll(color_hash_set);
        System.out.println("Hash Set after removing all the elements "+color_hash_set);
    }
}
//4. Write a Java program to empty an hash set.
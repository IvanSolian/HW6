package HashSet;

import java.util.HashSet;

public class HashSet5 {
    public static void main(String[] args) {
        HashSet<String> color_hash_set = new HashSet<String>();
        color_hash_set.add("Blue");
        color_hash_set.add("Orange");
        color_hash_set.add("White");
        color_hash_set.add("Green");
        color_hash_set.add("Gray");
        System.out.println("Normal HashSet : " + color_hash_set);
        System.out.println("Check list if is empty: "+color_hash_set.isEmpty());
        System.out.println("Remove all the elements : ");
        color_hash_set.removeAll(color_hash_set);
        System.out.println("Hash Set after removing all the elements "+color_hash_set);
    }
}
//        5. Write a Java program to test a hash set is empty or not.
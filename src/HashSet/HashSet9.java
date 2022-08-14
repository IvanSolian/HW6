package HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSet9 {
    public static void main(String[] args) {
        HashSet<String> color_hash_set = new HashSet<String>();
        color_hash_set.add("Blue");
        color_hash_set.add("Orange");
        color_hash_set.add("White");
        color_hash_set.add("Green");
        color_hash_set.add("Gray");
        System.out.println("HashSet: " + color_hash_set);
        List<String> list = new ArrayList<String>(color_hash_set);
        System.out.println("ArrayList contains: "+ list);
    }
}
//9. Write a Java program to convert a hash set to a List/ArrayList.
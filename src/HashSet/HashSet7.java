package HashSet;

import java.util.HashSet;
public class HashSet7 {
    public static void main(String[] args) {
        HashSet<String> color_hash_set = new HashSet<String>();
        color_hash_set.add("Blue");
        color_hash_set.add("Orange");
        color_hash_set.add("White");
        color_hash_set.add("Green");
        color_hash_set.add("Gray");
        System.out.println("HashSet: " + color_hash_set);
        String[] new_array = new String[color_hash_set.size()];
        color_hash_set.toArray(new_array);
        System.out.println("Array elements: ");
        for (String element : new_array) {
            System.out.println(element);

        }
    }
}
//7. Write a Java program to convert a hash set to an array.
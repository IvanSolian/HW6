package HashSet;
import java.util.HashSet;
public class HashSet6 {
    public static void main(String[] args) {
        HashSet<String> color_hash_set = new HashSet<String>();
        color_hash_set.add("Blue");
        color_hash_set.add("Orange");
        color_hash_set.add("White");
        color_hash_set.add("Green");
        color_hash_set.add("Gray");
        System.out.println("Normak HashSet "+ color_hash_set);
        HashSet <String> new_hash_set = new HashSet <String> ();
        new_hash_set = (HashSet)color_hash_set.clone();
        System.out.println("Cloned Hash Set: " + new_hash_set);
    }
}
//6. Write a Java program to clone a hash set to another hash set.
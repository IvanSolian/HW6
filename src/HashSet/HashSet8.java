package HashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class HashSet8 {

        public static void main (String[]args){
            HashSet<String> color_hash_set = new HashSet<String>();
            color_hash_set.add("Blue");
            color_hash_set.add("Orange");
            color_hash_set.add("White");
            color_hash_set.add("Green");
            color_hash_set.add("Gray");
            System.out.println("HashSet: " + color_hash_set);
            Set<String> tree_set = new TreeSet<String>(color_hash_set);
            System.out.println("TreeSet elements: "+ tree_set);
            for (String element : tree_set) {
                System.out.println(element);

            }
        }
    }
//8. Write a Java program to convert a hash set to a tree set.
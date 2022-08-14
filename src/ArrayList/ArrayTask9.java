package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayTask9 {
    public static void main(String[] args) {
        List<String> List1 = new java.util.ArrayList<>();
        List1.add("Blue");
        List1.add("Green");
        List1.add("Red");
        List1.add("Yellow");
        System.out.println("List1: " + List1);
        List<String> List2 = new ArrayList<>();
        List2.add("1");
        List2.add("2");
        List2.add("3");
        List2.add("4");
        System.out.println("List2: " + List2);

        Collections.copy(List1, List2);
        System.out.println(("List1: " + List1)+("List2: " + List2));
    }
}
//9. Write a Java program to copy one array list into another.
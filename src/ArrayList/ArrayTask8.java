package ArrayList;

import java.util.Collections;
import java.util.List;

public class ArrayTask8 {
    public static void main(String[] args) {

        List<String> colorList = new java.util.ArrayList<>();
        colorList.add("Orange");
        colorList.add("Black");
        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("White");
        System.out.println(colorList);
        System.out.println("List before sort: "+colorList);
        Collections.sort(colorList);
        System.out.println("List after sort: "+colorList);
    }
}
//8. Write a Java program to sort a given array list.
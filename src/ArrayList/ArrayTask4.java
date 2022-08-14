package ArrayList;

import java.util.List;

public class ArrayTask4 {
    public static void main(String[] args) {
        List<String> colorList = new java.util.ArrayList<>();
        colorList.add("Orange");
        colorList.add("Black");
        colorList.add("Orange");
        colorList.add("Blue");
        System.out.println(colorList);
        String element = colorList.get(0);
        System.out.println("First element " + element);
        element = colorList.get(3);
        System.out.println("Last element " + element);
    }
}
//4. Write a Java program to retrieve an element (at a specified index) from a given array list

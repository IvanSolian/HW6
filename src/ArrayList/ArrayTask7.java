package ArrayList;

import java.util.List;

public class ArrayTask7 {
    public static void main(String[] args) {

        List<String> colorList = new java.util.ArrayList<>();
        colorList.add("Orange");
        colorList.add("Black");
        colorList.add("Green");
        colorList.add("Blue");
        System.out.println(colorList);
        if (colorList.contains("Gray")) {
            System.out.println("Found the color");
        } else {
            System.out.println("Color is absent");
        }
    }
}
//7. Write a Java program to search an element in a array list
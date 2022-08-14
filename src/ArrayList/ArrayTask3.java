package ArrayList;

import java.util.List;

public class ArrayTask3 {
    public static void main(String[] args) {
        List<String> colorList = new java.util.ArrayList<>();
        colorList.add("Orange");
        colorList.add("Black");
        colorList.add("Gray");
        colorList.add("Blue");
        //System.out.println(colorList);
        colorList.add(0,"Green");
        System.out.println(colorList);

    }

}
//3. Write a Java program to insert an element into the array list at the first position.
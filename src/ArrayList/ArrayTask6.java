package ArrayList;

import java.util.List;

public class ArrayTask6 {
    public static void main(String[] args) {

        List<String> colorList = new java.util.ArrayList<>();
        colorList.add("Orange");
        colorList.add("Black");
        colorList.add("Yelow");
        colorList.add("Blue");
        System.out.println(colorList);
        colorList.remove(2);
        System.out.println(colorList);
    }
}
//6. Write a Java program to remove the third element from a array list.
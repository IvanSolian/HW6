package ArrayList;

import java.util.List;

public class ArrayTask5 {


    public static void main(String[] args) {
        List<String> colorList = new java.util.ArrayList<>();
        colorList.add("Orange");
        colorList.add("Black");
        colorList.add("Pink");
        colorList.add("Blue");
        System.out.println(colorList);
        colorList.set(0, "Green");
        System.out.println(colorList);
    }
}
//5. Write a Java program to update specific array element by given element
package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayTask10 {
    public static void main(String[] args) {
        List<String> colorList = new ArrayList<>();
        colorList.add("Orange");
        colorList.add("Black");
        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("White");
        System.out.println("List before shuffle:\n "+colorList);
        Collections.shuffle(colorList);
        System.out.println("List after shuffle:\n "+colorList);
    }
}
//10. Write a Java program to shuffle elements in a array list.
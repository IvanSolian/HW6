package ArrayList;

import java.util.List;

public class ArrayList<S> {

    public static void main(String[] args) {
        List<String> colorList = new java.util.ArrayList<>();
        colorList.add("Orange");
        colorList.add("Black");
        colorList.add("Orange");
        colorList.add("Blue");
        System.out.println(colorList);


//1. Write a Java program to create a new array list, add some colors (string) and print out the collection
        for (String iterate : colorList) {

            System.out.println(iterate);
        }
    }
}
//2. Write a Java program to iterate through all elements in a array list.



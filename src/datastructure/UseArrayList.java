package datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class UseArrayList {
    public static void main(String[] args) {

        //declare arrayList
        List<Integer> numList = new ArrayList<>();
        numList.add(2);
        numList.add(5);
        numList.add(8);
        numList.add(10);

        for (int i = 0; i < numList.size(); i++) {
            System.out.println(numList.get(i));
        }
        System.out.println(numList.get(0));
        numList.add(3, 12);
        for (int i = 0; i < numList.size(); i++) {
            System.out.println(numList.get(i));

            System.out.println("--------------------------");


            int list1[] = new int[10];
            // System.out.println("Please enter some number");
            Random random = new Random();
            for (i = 0; i < list1.length; i++) {
                System.out.println(list1[i]);
                list1[i] = random.nextInt(100);
            }

            //arrayList can take multiple data type
            //  List<Object> objList = new ArrayList<>();
            // objList.add("3");
            //  objList.add(3);
        }
    }
}
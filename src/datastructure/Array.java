package datastructure;

import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        //datatype - non-primitive
        //declare and initialize = inline array
        int myNumbers[] = {5, 3, 6, 6, 8};

        for (int i = 0; i < 6; i++) {
            System.out.println(myNumbers[i]);
        }
        System.out.println("------------------------------------------");
        //declare array of 5 number (size of the array)
        int[] myNumbers2 = new int[5];
        //assign array value
        myNumbers[0] = 2;
        myNumbers[1] = 6;
        myNumbers[2] = 4;
        myNumbers[3] = 1;
        myNumbers[4] = 2;

        System.out.println(myNumbers2[2]);
        System.out.println("----------------------------------");

        for (int i = 0; i < myNumbers2.length; i++) {
            System.out.println(myNumbers2[i]);
        }
        System.out.println("----------------------------------");


        //declare arrayList
        List<String> nameList1 = new ArrayList<>();
        nameList1.add("Syed");
        nameList1.add("Milon");

        List<Integer> numList1 = new ArrayList<>();
        numList1.add(2);
        numList1.add(5);
        numList1.add(8);


    }
}























































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































package datastructure;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class UseHashSet {
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>();
        hs.add(2);
        hs.add(3);
        hs.add(1);
        hs.add(6);
        System.out.println(hs);

        //Creating an object of Set class
        //Declaring object of Integer type
        Set<Integer> a = new HashSet<>();

        //Adding all elements to List
        a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0}));

        //Again declaring object olf Set class
        // with reference to HashSet
        Set<Integer> b = new HashSet<Integer>();

        b.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5}));

        //To find union
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.println("Union of the two Set");
        System.out.println(union);

        //To find intersection
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.println("Intersection of the two Set");
        System.out.println(intersection);

        //To find the symmetric difference
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.println("Difference of the two Set");
        System.out.println(difference);
    }
}



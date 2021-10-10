package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class useLinkedList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(list.size());
        System.out.println("--------------------------");
        list.set(2, "k");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(list.size());
    }
}

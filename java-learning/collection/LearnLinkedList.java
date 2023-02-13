package collection;

import java.util.LinkedList;
import java.util.List;
public class LearnLinkedList {
    public static void main(String [] args){
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("A");
        ll.add("B");
        ll.addLast("C"); // .addLast & .addFirst will not work in List
        ll.addFirst("D");
        ll.add(2, "E");

        System.out.println(ll);

        ll.remove(String.valueOf("B"));
        ll.remove(2);
        ll.removeFirst();   // .removeFirst & .removeLast will not work in List
        ll.removeLast();

        System.out.println(ll);

        List<String> list = new LinkedList<>();
        list.add("M");
        list.add("N");

        ll.addAll(list);

        System.out.println(ll);

        ll.clear();
        System.out.println(ll);

    }
}
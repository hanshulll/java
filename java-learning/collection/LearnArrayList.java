package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args){
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(4); // This will add 4 at the end of the List.
        System.out.println(list);

        list.add(2,7); // // This will add 7 at index 2. All the other elements will be shifted to right.
        System.out.println(list);

        List<Integer> newList = new ArrayList(); // Creating a new List which will be added to original list.
        newList.add(33);
        newList.add(12);
        newList.add(12);

        list.addAll(newList); // This will add all the elements present in newList to list.
        System.out.println(list);

        System.out.println(list.get(5)); // This will give the element on the index you specify

        list.remove(2); // This will remove the element from the index which you specify. All the other elements will be shifted to left.
        System.out.println(list);

        list.remove(Integer.valueOf(12)); // This will remove 12 from the list. But will remove only one element not two same element.
        System.out.println(list);

        list.set(2, 1000); // This will replace the element at the specified position in this list with the specified element.
        System.out.println(list);

        System.out.println(list.contains(12)); // The contains() method of List interface in Java is used for checking if the specified
                                              // element exists in the given list or not. It gives output in true or false.

        // Different ways to iterate in the list

        // 1) by using for loop

        for(int i = 0;i<list.size();i++){
            System.out.printf("The element number %d : %d\n",i,list.get(i));
        }
        System.out.println();

        // 2) by using Enchanced loop

        for(Integer element : list){
            System.out.printf("The elements in the list are : %d\n",element);
        }
        System.out.println();

        //3) by using ITERATOR

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.println("Iterator Element : "+it.next());
        }

        list.clear(); //This will remove all the elements from the list.
        System.out.println(list);
    }
}

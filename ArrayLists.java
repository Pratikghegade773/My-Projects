import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        //Add elements
        list.add(0);
        list.add(1);
        list.add(2);

        System.out.println(list);

        //Get elements
        int element = list.get(1);
        System.out.println(element);

        //Add element in between
        list.add(1, 7);
        System.out.println(list);

        //Set element
        list.set(0, 5);
        System.out.println(list);

        //Delete element
        list.remove(3);
        System.out.println(list);

        //size
        int size = list.size();
        System.out.println(size);

        //Loops
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        //Sorting
        Collections.sort(list);
        System.out.println(list);

    }
}

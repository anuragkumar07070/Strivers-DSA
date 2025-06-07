
import java.util.ArrayList;
import java.util.Collections;

public class Create{
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(0);
        list.add(2);
        System.out.println(list.get(3));
        System.out.println(list.set(5, 10));
        System.out.println(list.remove(2));
        System.out.println(list);


        Collections.sort(list);
        System.out.println(list);
    }
}
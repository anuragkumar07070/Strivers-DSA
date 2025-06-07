import java.util.*;
public class Monotonic {

    public static boolean mono(ArrayList<Integer> list){
        if(list.get(0)<list.get(list.size()-1)){
            for (int i = 1; i < list.size(); i++) {
                if(list.get(i-1)>list.get(i)){
                    return false;
                }
            }
        }else{
            for (int i = 1; i < list.size(); i++) {
                if(list.get(i-1)<list.get(i)){
                    return false;
                }
            }
        }
        return true;

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

      
        list.add(10);
        list.add(9);
        list.add(6);
        list.add(4);
        list.add(2);
        list.add(3);
       
        boolean result = mono(list);
        System.out.println(result);
    }
    
}

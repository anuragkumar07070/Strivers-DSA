
import java.util.ArrayList;

public class Pairsum {

    public static boolean pairs(ArrayList<Integer> list , int target){
        int start = 0;
        int end = list.size()-1;

        while(start<=end){
            int num1 = list.get(start); 
            int num2 = list.get(end);

            int num = num1 + num2;

            if(num == target){
                System.out.println("{"+num1+","+num2 +"}");
                return true;
            }
            if(num > target){
                end--;
            }
            else{
                start++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < 7; i++) {
            list.add(i); 
        }

        int target = 8;

        System.out.println(list);

        boolean output = pairs(list, target);
        System.out.println(output);
    }
}

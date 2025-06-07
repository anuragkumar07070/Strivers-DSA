
import java.util.ArrayList;

public class FillWater {

    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;
        int start = 0;
        int end = height.size()-1;

        while(start<end){

            int h1 =height.get(start);
            int h2 = height.get(end);

            int ht = Math.min(h1, h2);
            int width = end - start;

            int currWater = ht*width;

            maxWater = Math.max(currWater, maxWater);

            if(h1>h2){
                end--;
            }
            else{
                start++;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {

        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        int result = storeWater(height);
        System.out.println(result);

    }
    
}

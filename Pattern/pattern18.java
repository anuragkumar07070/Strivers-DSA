package Pattern;

public class pattern18 {
    public static void main(String[] args) {
        int n = 5;
        char X = 'E';

        for (int i = 0; i <n; i++) {
            char ch= (char)(X- i);
            for(int j = 0; j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}


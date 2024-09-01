package Pattern;


public class pattern19Again {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < 2 * n; i++) {
            int stars = n - Math.abs(n - i);
            System.out.println(stars+" ");
            int underscores = 2 * (n - stars);

            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < underscores; j++) {
                System.out.print("_");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


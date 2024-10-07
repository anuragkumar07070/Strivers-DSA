package Recurrsion;

public class CheckPallindrome {

    public static boolean check(String a, int i) {
        // Base case: If we reach the middle, the string is a palindrome
        if (i >= a.length() / 2) {
            return true;
        }

        // Check if characters at the current index and its mirror position match
        if (a.charAt(i) != a.charAt(a.length() - i - 1)) {
            return false;
        }

        // Recursive case: Check the next pair of characters
        return check(a, i + 1);
    }

    public static void main(String[] args) {
        String a = "rcar";
        int i = 0;

        boolean result = check(a, i);
        System.out.println(result);
    }
}

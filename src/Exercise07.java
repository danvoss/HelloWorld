import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dan on 6/28/16.
 */
public class Exercise07 {
    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(isPalindrome("racecar")); // true
        System.out.println(isPalindrome("hello")); //false
    }

    public static boolean isPalindrome(String input) {

        char[] array = input.toCharArray();
        for (int i = 0; i < array.length; i++) {



        }

        return false;
    }

    public static boolean isPal2(String input){
        StringBuilder sb = new StringBuilder(input);
        return (input.equals(sb.reverse().toString()));
    }

    public boolean isPal3(String input){
        int x = 0;
        int y = input.length() - 1;

        return false;
    }
}

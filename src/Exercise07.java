import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dan on 6/28/16.
 */
public class Exercise07 {
    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(isPal2("racecar")); // true
        System.out.println(isPal3("hello")); //false
        System.out.println(isPal("racecar")); //true

    }

    public static boolean isPal2(String input){
        StringBuilder sb = new StringBuilder(input);
        return (input.equals(sb.reverse().toString()));
    }

    public static boolean isPal3(String input){
        int x = input.length() - 1;
        int y = 0;
        while (x>0){
            if(input.toCharArray()[x] != input.toCharArray()[y]){
                return false;
            } else{
                x--;
                y++;
            }
        }
        return true;
    }

    // solve using recursion:
    public static boolean isPal(String input) {
        if (input.length() <=1) {
            return true;
        }
        if (input.charAt(0) != input.charAt(input.length()-1)) {
            return false;
        }
        return isPal(input.substring(1, input.length()-1));
    }
}

import java.util.ArrayList;

/**
 * Created by Dan on 6/22/16.
 */
public class Exercise06 {
    public static void main(String[] args) {
        int num = 12345;
        // turn into : int 54321

        String str = "abcd";

        solveViaLoop(num);
        solveViaStringbuilder(num);
        solveViaMath(num);

        String reverseStr = solveRecursively(str);
        System.out.println(reverseStr);
    }

    public static void solveViaLoop(int num) {
        char[] chars = String.valueOf(num).toCharArray();
        char[] reverseChars = new char[chars.length];
        int n = chars.length - 1;
        for (char c : chars) {
            reverseChars[n] = c;
            n--;
        }
        int reverseNum= Integer.valueOf(String.valueOf(reverseChars));
        System.out.println(reverseNum);
    }

    public static void solveViaStringbuilder(int num) {
        StringBuilder s = new StringBuilder(String.valueOf(num));
        int reverseNum = Integer.valueOf(s.reverse().toString());
        System.out.println(reverseNum);
    }

    public static void solveViaMath(int num) {
        int reverseNum = 0;
        while (num != 0) {
            reverseNum = reverseNum * 10;
            reverseNum = reverseNum + num % 10;
            num = num / 10;
        }
        System.out.println(reverseNum);
    }

    // new, via javarevisited blog:

    public static String solveRecursively(String str) {
        if (str.length() < 2) {
            return str;
        }
        return solveRecursively(str.substring(1)) + str.charAt(0);
    }
}

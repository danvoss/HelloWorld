import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Dan on 6/9/16.
 */
public class Exercise05 {
    public static void main(String[] args) {
        String[] names = {"Charlie", "David", "Alice", "Bob", "Albert"};


        // ArrayList<String> sortedNames
        // a naive, inefficient sorting algorithm:

        ArrayList<String> sortedNames = new ArrayList<>();
        for (String name : names) {
            int index = 0;
            for (String sortedName : sortedNames) {
                if (name.compareTo(sortedName) > 0) {
                    index++;
                }
                else {
                    break;
                }
            }
            sortedNames.add(index, name);
        }
    }
}

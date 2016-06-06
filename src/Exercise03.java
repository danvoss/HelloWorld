import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

/**
 * Created by Dan on 6/6/16.
 */
public class Exercise03 {
    public static void main(String[] args) {
        String[] names = {"alice", "bob", "charlie", "andrew", "edward"};

        // ArrayList<String> that contains the names with only capital letters
        // remove names that don't start with A
        // --> ["ALICE", "ANDREW"]

        //solution 1: modify index after removing
        ArrayList<String> aNames = new ArrayList<>();
        for (String name : names) {
            aNames.add(name.toUpperCase());
        }
        for (int i = 0; i < aNames.size(); i++) {
            String name = aNames.get(i);
            if (!name.startsWith("A")) {
                aNames.remove(i);
                i--;
            }
        }
        System.out.println(aNames);

        // solution 2: use temporary collections
        aNames = new ArrayList<>();
        for (String name : names) {
            aNames.add(name.toUpperCase());
        }
        ArrayList<String> tempNames = new ArrayList<>();
        for (String name : aNames) {
            if (name.startsWith("A")) {
                tempNames.add(name);
            }
        }
        System.out.println(tempNames);

        // solution 3: use iterator
        aNames = new ArrayList<>();
        for (String name : names) {
            aNames.add(name.toUpperCase());
        }
        Iterator<String> iter = aNames.iterator();
        while (iter.hasNext()) {
            String name = iter.next();
            if (!name.startsWith("A")) {
                iter.remove();
            }
        }
        System.out.println(aNames);

        // solution 4: use a stream
        aNames = new ArrayList<>();
        for (String name : names) {
            aNames.add(name);
        }
        aNames = aNames.stream()
                .map((name) -> {
                    return name.toUpperCase();
                })
                .filter((name) -> {
                    return name.startsWith("A");
                })
                .collect(Collectors.toCollection(ArrayList<String>::new));
        System.out.println(aNames);
    }
}

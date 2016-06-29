import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Dan on 6/29/16.
 */
public class Exercise08 {
    public static void main(String[] args) throws FileNotFoundException {
        // parse people.csv into ArrayList<String> that contains first and last names separated by a space
        // prompt the user for search term
        // print out the names that contain that term

        ArrayList<String> people = new ArrayList<>();

        File f = new File("people.csv");
        Scanner scanner = new Scanner(f);
        scanner.nextLine();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] columns = line.split(",");
            String name = columns[1] + " " + columns[2];
            people.add(name);
        }

        Scanner userScanner = new Scanner(System.in);
        System.out.println("Type search term.");
        String search = userScanner.nextLine();

        people
                .stream()
                .filter(name -> name.toLowerCase().contains(search.toLowerCase()))
                .forEach(System.out::println);
    }
}

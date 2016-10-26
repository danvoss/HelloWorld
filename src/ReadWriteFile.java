import java.io.*;
import java.util.Scanner;

/**
 * Created by Dan on 5/25/16.
 */
public class ReadWriteFile {
    public static void main(String[] args) throws IOException {
        File f = new File("names.txt");

        FileWriter fw = new FileWriter(f);
        fw.write("Alice\n"); // overwrite the file if it exists
        fw.append("Bob\n");
        fw.append("Charlie\n");
        fw.close();

        // read line-by-line
        Scanner scanner = new Scanner(f);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }

        // read entire file
        scanner = new Scanner(f);
        scanner.useDelimiter("\\Z");
        System.out.println(scanner.next());

        // new, 10/16:
        BufferedReader fileReader = new BufferedReader(new FileReader("names.txt"));
        String s;
        while (fileReader.ready()) {
            s = fileReader.readLine();
            System.out.println(s);
        }

    }
}

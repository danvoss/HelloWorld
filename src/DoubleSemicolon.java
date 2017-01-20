/**
 * Created by Dan on 1/19/17.
 */
public class DoubleSemicolon {

    public static void main(String[] args) {

        int x = 0;

        for( ;; ) {
            if (x < 5) {
                System.out.println(x + " ");
                x++;
            }
            break;
        }
        System.out.println("Finished.");
    }
}

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numPages = scan.nextInt();

        String[][] input = new String[numPages][];
        for(int i=0;i<numPages;i++) {
                input[i] = scan.nextLine().split(" ");
        }
    }
}

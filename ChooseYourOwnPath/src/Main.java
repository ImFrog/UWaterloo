import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numPages = Integer.parseInt(scan.nextLine());

        int[][] input = new int[numPages][];
        for(int i=0;i<input.length;i++) {
            String[] nextLine = scan.nextLine().split(" ");
            int[] pages = new int[nextLine.length];
            for(int k=0;k<nextLine.length;k++) {
                pages[k] = Integer.parseInt(nextLine[k]);
            }
            input[i] = pages;
        }


        for(int[] i: input) {
            for(int j: i) {
                if (j == 0) {

                }
            }
        }
    }
}

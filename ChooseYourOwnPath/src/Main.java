import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    private static int[][] pages;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        int numPages = Integer.parseInt(scan.nextLine());
        pages = new int[numPages][];

        for(int i=0;i<pages.length;i++) {
            String[] nextLine = scan.nextLine().split(" ");
            int[] pageData = new int[nextLine.length];
            for(int k=0;k<nextLine.length;k++) {
                pageData[k] = Integer.parseInt(nextLine[k]);
            }
            pages[i] = pageData;
        }

    }
}

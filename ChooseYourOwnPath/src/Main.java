import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    private static int[][] pages;

    private static int walkThroughAllPaths(int[] pageData) {
        int num = 0;
        for(int i=1;i<pageData.length;i++) {
            int temp = walkThroughAllPaths(pages[pageData[i]]);
            if (temp > num) num = temp;
        }
        if(pageData[0] == 0) return 1;
        else num += 1;
        return num;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("H:\\My Documents\\Programming\\Programming 12\\UWaterloo\\ChooseYourOwnPath\\src\\in"));
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

        System.out.println("\n" + walkThroughAllPaths(pages[0]));
    }
}

import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        int numPages = Integer.parseInt(scan.nextLine());
        int[][] pages = new int[numPages][];

        for(int i=0;i<pages.length;i++) {
            String[] nextLine = scan.nextLine().split(" ");
            int[] pageData = new int[nextLine.length];
            for(int k=0;k<nextLine.length;k++) {
                pageData[k] = Integer.parseInt(nextLine[k]);
            }
            pages[i] = pageData;
        }

        LinkedList<Integer> pageQueue = new LinkedList<>();
        ArrayList<Integer> pagesVisited = new ArrayList<>();
        pageQueue.add(0);
        pagesVisited.add(0);
        int level = 1;
        int shortestPathNum = 0;

        while(pageQueue.size() != 0) {
            int queueSize = pageQueue.size();
            for (int i=0;i<queueSize;i++) {
                int currentPage = pageQueue.pop();
                if (pages[currentPage][0] == 0 && level != 0) {
                    shortestPathNum = level;
                    level = 0;
                    continue;
                }
                for(int j=1;j<pages[currentPage].length;j++) {
                    if(!pagesVisited.contains(pages[currentPage][j] - 1)) {
                        pageQueue.add(pages[currentPage][j] - 1);
                        pagesVisited.add(pages[currentPage][j] - 1);
                    }
                }
            }
            if(level != 0) level++;
        }

        if(pagesVisited.size() == numPages) System.out.println("Y");
        else System.out.println("N");
        System.out.println(shortestPathNum);
    }
}

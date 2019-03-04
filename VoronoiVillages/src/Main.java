import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] villages = new int[scan.nextInt()];

        for(int i = 0; i < villages.length; i++) {
            villages[i] = scan.nextInt();
        }

        Arrays.sort(villages);

        double size = 0;

        for(int i = 1; i < villages.length - 1; i++) {
            double neighborhoodSize = (villages[i] - villages[i-1]) / 2.0 + (villages[i + 1] - villages[i]) / 2.0;

            if (size == 0) {
                size = neighborhoodSize;
                continue;
            }

            if (neighborhoodSize < size) size = neighborhoodSize;
        }

        DecimalFormat df = new DecimalFormat("#.0");
        System.out.println(df.format(size));
    }
}

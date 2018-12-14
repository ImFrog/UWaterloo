import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int parkingSpaces = scan.nextInt();
        String parkingRecordYesterday = scan.next();
        String parkingRecordToday = scan.next();
        int output = 0;

        for (int i=0;i<parkingSpaces;i++) {
            if (parkingRecordYesterday.charAt(i) == parkingRecordToday.charAt(i)
                    && parkingRecordYesterday.charAt(i) == 'C') {
                output += 1;
            }
        }

        System.out.println(output);
    }
}

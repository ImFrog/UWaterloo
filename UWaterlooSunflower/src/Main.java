import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int[][] table = new int[number][number];

        for (int j = 0; j< table.length; j++) {
            for (int k = 0; k< table.length; k++) {
                table[j][k] = scan.nextInt();
            }
        }

        int cornerOne = table[0][0];
        int cornerTwo = table[0][table.length - 1];
        int cornerThree = table[table.length - 1][0];
        int cornerFour = table[table.length - 1][table.length - 1];

        if (cornerOne < cornerTwo && cornerOne < cornerThree) {
            for (int j = 0 ; j < table.length ; j++) {
                for (int k = 0 ; k < table.length ; k++) {
                    System.out.print(table[j][k] + " ");
                }
                System.out.println();
            }
        }

        if (cornerOne > cornerThree && cornerThree < cornerFour) {
            for (int k = 0 ; k < table.length ; k++) {
                for (int j = table.length - 1 ; j >= 0 ; j--) {
                    System.out.print(table[j][k] + " ");
                }
                System.out.println();
            }
        }

        if (cornerThree > cornerFour && cornerFour < cornerTwo) {
            for (int j = table.length - 1; j >= 0 ; j--) {
                for (int k = table.length - 1; k >= 0; k--) {
                    System.out.print(table[j][k] + " ");
                }
                System.out.println();
            }
        }

        if (cornerOne > cornerTwo && cornerFour > cornerTwo) {
            for (int k = table.length - 1; k >= 0; k--) {
                for (int j = 0 ; j < table.length ; j++) {
                    System.out.print(table[j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}

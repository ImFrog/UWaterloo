import java.util.Scanner;

public class Main {
    private static String[][] rules = new String[3][2];

    private static boolean something(String start, String goal, int step) {
        if (start.equals(goal)) return true;
        for (int i = 0; i < rules.length; i++) {
            if (start.contains(rules[i][0])) {
                step++;
                int begin;
                String temp = start;

                while (temp.contains(rules[i][0])) {
                    begin = temp.indexOf(rules[i][0]);

                    String change = start.substring(0, begin + 1).concat(temp.replace(rules[i][0], rules[i][1]));
                    if (something(change, goal, step)) {
                        System.out.println(i + " " + start.indexOf(rules[i][0]) + " " + change);
                        return true;
                    }

                    temp = temp.substring(begin + 1);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (String[] rule: rules) {
            rule[0] = scan.next();
            rule[1] = scan.next();
        }

        int reqSteps = scan.nextInt();

        something(scan.next(), scan.next(), 0);
    }
}

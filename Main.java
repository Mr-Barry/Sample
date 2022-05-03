import java.util.Scanner;

public class Main {

    // 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    static boolean isValid(int day, int month) {
        if (month < 0 || month > 11) return false;
        else if (day > 30 || day < 0) return false;
        else if (month == 1 && day > 27) return false;
        else if ((month == 3 || month == 5 || month == 8 && month == 10) && day > 29) return false;
        else return true;
    }

    public static void main(String[] args) {
        int[][] days = new int[12][31];
        for (int i=0; i < 12; i++) {
            for (int j=0; j < 31; j++) {
                days[i][j] = 0;
            }
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter month and day");
        int month = scan.nextInt();
        int day = scan.nextInt();
        if (!(isValid(day-1, month-1))) {
            System.out.println("Wrong date");
            return;
        }

        int curMonth = 11;
        int curDay = 29;
        while (curDay >= 0 || curMonth >= 0) {
            if (isValid(curDay + 1, curMonth)) {
                if (days[curMonth][curDay+1] == 0) days[curMonth][curDay] = 1;
            }
            if (isValid(curDay, curMonth + 1)) {
                if (days[curMonth + 1][curDay] == 0) days[curMonth][curDay] = 1;
            }

            if (curDay == 0) {
                if (curMonth == 0) break;
                if (isValid(30, curMonth - 1)) {
                    curDay = 30;
                    curMonth--;
                }
                else if (isValid(29, curMonth - 1)) {
                    curDay = 29;
                    curMonth--;
                }
                else {
                    curDay = 27;
                    curMonth--;
                }
            }
            else curDay--;
        }

        if (days[month-1][day-1] == 1) System.out.println("Yes");
        else System.out.println("No");
    }
}

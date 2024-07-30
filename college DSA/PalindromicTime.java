import java.util.Scanner;

public class PalindromicTime {

    public static boolean isPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static String formatTime(int hours, int minutes) {
        return String.format("%02d%02d", hours, minutes);
    }

    public static int[] incrementTime(int hours, int minutes) {
        minutes++;
        if (minutes == 60) {
            minutes = 0;
            hours++;
            if (hours == 24) {
                hours = 0;
            }
        }
        return new int[] { hours, minutes };
    }

    public static int findNextPalindromicTime(int startHours, int startMinutes) {
        int minutesPassed = 0;
        int[] time = { startHours, startMinutes };

        while (true) {
            time = incrementTime(time[0], time[1]);
            minutesPassed++;

            String timeStr = formatTime(time[0], time[1]);
            if (isPalindrome(timeStr)) {
                return minutesPassed;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputTime = scanner.nextLine();
        scanner.close();

        String[] parts = inputTime.split(":");
        int startHours = Integer.parseInt(parts[0]);
        int startMinutes = Integer.parseInt(parts[1]);

        int result = findNextPalindromicTime(startHours, startMinutes);
        System.out.println(result);
    }
}
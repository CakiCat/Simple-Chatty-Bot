import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();

        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();

        int hoursToSeconds1 = 3600 * hours1;
        int minutesToSeconds1 = 60 * minutes1;
        int startTime = hoursToSeconds1 + minutesToSeconds1 + seconds1;

        int hoursToSeconds2 = 3600 * hours2;
        int minutesToSeconds2 = 60 * minutes2;
        int endTime = hoursToSeconds2 + minutesToSeconds2 + seconds2;

        System.out.println(endTime - startTime);
    }
}
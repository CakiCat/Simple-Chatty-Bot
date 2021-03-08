import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean b = scanner.nextBoolean();

        boolean notWeekend = (a >= 10 && a <= 20) && !b;
        boolean weekend = (a >= 15 && a <= 25) && b;
        System.out.println(notWeekend || weekend);
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2;
        int max = 0;
        int count = 0;
        while (count < num1) {
            num2 = scanner.nextInt();
            count++;
            if (num2 % 4 == 0 && num2 > max) {
                max = num2;
            }
        }
        System.out.println(max);
    }
}
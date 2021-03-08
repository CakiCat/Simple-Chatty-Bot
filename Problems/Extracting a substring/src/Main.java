import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();


        str = str.substring(num1, num2 +1);
        System.out.println(str);
    }
}
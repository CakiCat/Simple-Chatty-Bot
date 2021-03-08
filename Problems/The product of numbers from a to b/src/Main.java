import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long prodcut = 1;
        for (int i = a; i < b; i++) {
            prodcut *= i;
        }
        System.out.println(prodcut);

    }
}
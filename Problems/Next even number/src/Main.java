import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = ((n/2)+1)+((n/2)+1);
        System.out.println(m);
    }
}
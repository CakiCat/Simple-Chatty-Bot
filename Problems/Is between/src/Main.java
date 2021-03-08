import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.next());
        int n2 = Integer.parseInt(scanner.next());
        int n3 = Integer.parseInt(scanner.next());

        boolean m = ((n1 <= n2 && n1 >= n3) || (n1 >= n2 && n1 <= n3));
        System.out.println(m);
    }
}
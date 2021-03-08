import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int n = 1;
        while (n*n <= N){
            System.out.println(n*n);
            n++;
        }
    }
}
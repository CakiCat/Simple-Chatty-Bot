import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long n = 1;
        long num = 1;
        while (n <= m){
            num++;
            n *= num;
        }
        System.out.println(num);
    }
}
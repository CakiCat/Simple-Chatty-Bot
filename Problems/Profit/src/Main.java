import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double M = scanner.nextInt(); //money
        double P = scanner.nextInt(); //percet per year
        double K = scanner.nextInt(); // deposit
        int count = 0;
        P = 0.01 * P;

        while (M < K){
            M = M + M * P;
            count++;
        }
        System.out.println(count);
    }
}
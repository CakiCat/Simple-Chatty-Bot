import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true){
            if (sum >= 1000){
                System.out.println(sum - 1000);
                break;
            } else {
                int n = scanner.nextInt();
                if (n !=0){
                    sum += n;
                } else {
                    System.out.println(sum);
                    break;
                }

            }

        }
    }
}
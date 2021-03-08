import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int temp12 = num / 100;
        int temp4 = num % 10;
        int temp3 = (num /10) % 10;

        if (temp12 == temp4 * 10 + temp3){
            System.out.println("1");
        } else {
            System.out.println("37");
        }

    }
}
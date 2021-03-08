import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 1;
        int count = 0;
        while (num != 0){
            num = scanner.nextInt();
            count++;
        }
        count--;
        System.out.println(count);

    }
}
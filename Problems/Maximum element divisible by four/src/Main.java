import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int temp = 0;
        for (int i=0; i<input; i++){
            int num = scanner.nextInt();
            if (num % 4 == 0){
                if (num > temp){
                    temp = num;
                }
            }
        }
        System.out.println(temp);
    }
}
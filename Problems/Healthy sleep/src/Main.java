import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt(); // A sleep minimum
        int B = scanner.nextInt(); // B sleep maximum
        int H = scanner.nextInt(); // H total sleep

        if (A <= B){
            if (H < A){
                System.out.println("Deficiency");
            } else if (H > B){
                System.out.println("Excess");
            } else {
                System.out.println("Normal");
            }
        }


    }
}
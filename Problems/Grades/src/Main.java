import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grades = scanner.nextInt();
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;

        for (int i=0; i< grades; i++){
            int grade = scanner.nextInt();
            if (grade == 5){
                A++;
            } else if (grade == 4){
                B++;
            } else if (grade == 3){
                C++;
            } else if (grade == 2){
                D++;
            }
        }

        System.out.println(D + " " + C + " " + B + " " + A);
    }
}
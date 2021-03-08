import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        int c = Integer.parseInt(scanner.next());

        boolean check1 = (a > 0 && b <=0 && c <=0);
        boolean check2 = (b > 0 && a <=0 && c <=0);
        boolean check3 = (c > 0 && b <=0 && a <=0);
        boolean finalCheck = check1 || check2 || check3;
        System.out.println(finalCheck);
    }
}
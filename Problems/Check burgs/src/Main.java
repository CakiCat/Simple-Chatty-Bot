import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.toLowerCase().replace(" ", "").trim();
        System.out.println(str.endsWith("burg"));
    }
}
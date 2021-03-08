import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = 1; i <= b; i++) {
            int hb = scanner.nextInt();
            if (h >= hb){
                System.out.println("Will crash on bridge " + i);
                break;
            } else if (i == b){
                System.out.println("Will not crash");
                break;
            }

        }

    }
}
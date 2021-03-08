import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h1 = Integer.parseInt(scanner.next());
        int h2 = Integer.parseInt(scanner.next());
        int h3 = Integer.parseInt(scanner.next());

        boolean ascending = (h1 <= h2 && h2 <= h3);
        boolean descending = (h1 >= h2 && h2 >= h3);
        boolean check = ascending || descending ;
        System.out.println(check);

    }
}
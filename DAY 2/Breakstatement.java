import java.util.Scanner;

public class Breakstatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER n:");
        do {
            int n = sc.nextInt();
            System.out.println(n);
            if (n == 10 || n == 10 * n) {
                break;
            } else {
                System.out.println("THE PROGRAM IS ENDED");
            }
        } while (true);

    }
}

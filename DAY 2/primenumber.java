import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER n: ");
        int n = sc.nextInt();

        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("THIS IS A PRIME NUMBER...");
        } else {
            System.out.println("THIS IS NOT A PRIME NUMBER...");
        }

        sc.close();
    }
}

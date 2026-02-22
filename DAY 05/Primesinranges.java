public class Primesinranges {

    public static boolean prime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeinrange(int n) {
        for (int i = 2; i <= n; i++) {   // ✅ start from 2
            if (prime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        primeinrange(12);
    }
}

    


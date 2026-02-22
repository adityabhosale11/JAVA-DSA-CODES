import java.util.Scanner;
public class Print1ton {
    public static void main(String[] args) {
        int i=0;
        System.out.println("ENTER THE VALUE OF n:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}

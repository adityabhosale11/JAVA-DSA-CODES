import java.util.Scanner;
public class binomialcoeff {
    public static int fact(int a){
        int f=1;
        for(int i=1;i<=a;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER n...");
        int n=sc.nextInt();
        System.out.println("ENTER r...");
        int r=sc.nextInt();
        int s=n-r;

        int n_fact=fact(n);
        int r_fact=fact(r);
        int nmr_fact=fact(s);

        int result=n_fact/(r_fact*nmr_fact);

        System.out.println("THE BINOMIAL COEFF IS :"+result);

    }
}

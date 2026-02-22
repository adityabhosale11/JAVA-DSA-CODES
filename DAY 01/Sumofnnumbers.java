import java.util.Scanner;
public class Sumofnnumbers {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        System.out.println("ENTER THE VALUE OF n:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println("THE SUM OF n NATURAL NUMBERS IS:"+sum);
    }
}

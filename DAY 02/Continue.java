import java.util.Scanner;
public class Continue {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER THE NUMBER n");
        do{
            int n=sc.nextInt();
            if (n%10==0) {
             continue;
            }
             System.out.println("THE NUMBER IS :"+n);
        }while(true);
    }
    
}

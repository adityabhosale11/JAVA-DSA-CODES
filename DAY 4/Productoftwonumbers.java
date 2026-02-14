import java.util.Scanner;
public class Productoftwonumbers {
    public static int product(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A AND B:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result;
        result=product(a, b);
        System.out.println("THE PRODUCT IS :"+result);
       
    }
}

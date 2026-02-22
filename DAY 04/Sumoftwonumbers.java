import java.util.Scanner;
public class Sumoftwonumbers {
    public static int sum(int a,int b){
        int s;
        s=a+b;
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER a AND b:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result;
        result =sum(a, b);
        System.out.println("THE RESULT IS:"+result);
    }
}

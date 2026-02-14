import java.util.Scanner;
public class Swapoftwonumbers {
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("THE VALUE OF A..."+a);
        System.out.println("THE VALUE OF B..."+b);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE VALUES");
        int a=sc.nextInt();
        int b=sc.nextInt();
        swap(a, b);
    }
    
}

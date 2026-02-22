import java.util.Scanner;
public class Printreverseofanumber {
    public static void main(String[] args) {
      int rev=0;
      int lastdigit;
    System.out.println("ENTER THE NUMBER: n");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    while(n>0){
        lastdigit=n%10;
        n=n/10;
        rev=(rev*10)+lastdigit;

    }
    System.out.println("THE REVERSE NUMBER IS:"+rev);
    
    }

    
    
}

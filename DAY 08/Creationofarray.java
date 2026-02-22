import java.util.Scanner;

public class Creationofarray {
    public static void main(String[] args) {
        int marks[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER MARKS OF SUB 1:");
        marks[0]=sc.nextInt();
        System.out.println("ENTER MARKS OF SUB 2:");
        marks[1]=sc.nextInt();
        System.out.println("ENTER MARKS OF SUB 3:");
        marks[2]=sc.nextInt();
        System.out.println("ENTER MARKS OF SUB 4:");
        marks[3]=sc.nextInt();
        System.out.println("ENTER MARKS OF SUB 5:");
        marks[4]=sc.nextInt();

        System.out.println("LENGTH OF ARRAY IS "+marks.length);

        for(int i=0;i<=4;i++){
            System.out.println("THE MARKS ARE..."+marks[i]);
        }
    }
}

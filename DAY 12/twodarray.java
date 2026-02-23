import java.util.Scanner;
public class twodarray {

    public static boolean search(int array[][],int key){
         key=8;
         int n=3,m=3;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(array[i][j]==key){
                   System.out.println("ELEMENT FOUND AT INDEX :"+i+","+j);
                    return true;
                }
            }
            
        }
        return false;
        
    }

    public static void main(String[] args) {
        int array[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        int n=3;
        int m=3;

        System.out.println("ENTER THE ELEMENTS IN THE MATRIX");

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
    
                array[i][j]=sc.nextInt();
            }
        }

        //output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(array[i][j]  +" ");
            }
            System.out.println();
        }
        search(array, m);
    }
    
}


public class Hollowrectangle {
    public static void Hollow_Rectangle(int rows,int cols){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){
                if(i==1|| i==rows|| j==1|| j==cols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
            
        }
        

    } 
    public static void main(String[] args) {
        Hollow_Rectangle(4, 5);
        
    }
    
}

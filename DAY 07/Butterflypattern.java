public class Butterflypattern {
    public static void Butterfly(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"); //PRINT STARS
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" "); //PRINT SPACES
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"); //PRINT STARS
            }
            System.out.println();
        }//FIRST HALF COMPLETED

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*"); //PRINT STARS
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" "); //PRINT SPACES
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"); //PRINT STARS
            }
            System.out.println();

        }//SECONF HALF COMPLETED 
    }
    public static void main(String[] args) {
        Butterfly(5);
    }
    
}

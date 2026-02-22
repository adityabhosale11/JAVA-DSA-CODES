public class Checkprime {
    public static boolean prime(int a){
        boolean isprime=true;
        for(int i=2;i<=a-1;i++){
            if(a%i==0){
                isprime=false;
                break;
            }
        }
        return isprime;

    }
    public static void main(String[] args) {
        System.out.println(prime(5));
      
        
    }
}

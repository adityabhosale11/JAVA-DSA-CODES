public class Evenorodd {
    public static boolean EvenorOdd(int n){
        if(n%2==0){
           return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        boolean result=EvenorOdd(7);
        System.out.println("THE RESULT IS..."+result);
    }
}

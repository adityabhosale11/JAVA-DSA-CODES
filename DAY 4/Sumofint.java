public class Sumofint {
    public static int sum(int n){
        int s=0;
        for(int i=0;i<=n;i++){
            s+=i;
        }
        return s;

    }
    public static void main(String[] args) {
        int result=sum(7);
        System.out.println("THE SUM IS..."+result);
    }
}

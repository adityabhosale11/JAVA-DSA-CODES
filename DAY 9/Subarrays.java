public class Subarrays {
    public static void Printsubarray(int numbers[]){
        int ts=0;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i+1;j<numbers.length;j++){
                int end=j;
                for(int a=start;a<=end;a++){
                    
                    System.out.print("["+numbers[a]+" ]");
                    ts++;
                }
                System.out.println();
            }System.out.println();
            
        }
        System.out.println("THE TOTAL SUB ARRAYS ARE..."+ts);
    }
    public static void main(String[] args) {
    int numbers[]={2,4,6,8,10};   
    Printsubarray(numbers); 
    }
}

public class MaxSubarrays {
    public static void Maxsubarray(int numbers[]){
        int currentSum=0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            int start=i;

            for(int j=i+1;j<numbers.length;j++){
                int end=j;
                 currentSum=0;
                for(int a=start;a<=end;a++){
                    
                    currentSum+=numbers[a];
                }
                System.out.println(currentSum);
                if(maxsum<currentSum){
                    maxsum=currentSum;

                }
            }
            
        }
        System.out.println("MAX SUM="+maxsum);
        
    }
    public static void main(String[] args) {
    int numbers[]={2,4,6,8,10};   
    Maxsubarray(numbers); 
    }
}

import java.util.*;
public class Largestelement {
    public static int getlargest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
        }
        return largest;

    }
    public static void main(String[] args) {
        int numbers[]={1,2,6,10,5};
        int largestnum=getlargest(numbers);
        System.out.println("THE LARGEST NUMBER IS..."+largestnum);
        

    }
}

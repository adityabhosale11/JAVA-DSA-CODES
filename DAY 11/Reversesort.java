import java.util.Arrays;
import java.util.Collections;
public class Reversesort {
    public static void main(String[] args) {
        Integer numbers[]={5,4,1,3,2};
        Arrays.sort(numbers,Collections.reverseOrder());
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }


    }
    
}

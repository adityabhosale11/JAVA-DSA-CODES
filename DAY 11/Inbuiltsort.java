import java.util.Arrays;;
public class Inbuiltsort {
    public static void main(String[] args) {
        int Numbers[]={5,4,1,3,2};
        Arrays.sort(Numbers,0,3);
        for(int i=0;i<Numbers.length;i++){
            System.out.println(Numbers[i]);
        }
    }
}

import java.util.*;
public class Arrayasargument {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={99,98,97};
        update(marks);

        for(int i=0;i<marks.length;i++){
            System.out.println("ORG MARKS..."+marks[i]);
        }

        for(int i=0;i<marks.length;i++){
            System.out.println("UPDATED MARKS ARE..."+marks[i]);
        }
    }
}

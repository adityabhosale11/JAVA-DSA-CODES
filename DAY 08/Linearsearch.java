public class Linearsearch {
    public static int linearsearch(int numbers[],int key,String fruits[],String key1){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                System.out.println("THE ELEMENT IS AT INDEX..."+i);
            }
        }
        
        for(int j=0;j<fruits.length;j++){
            if(fruits[j]==key1){
                System.out.println("THE ELEMENT IS AT INDEX..."+j);
            }
        }
        return-1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14,16};
        String fruits[]={"apple","mange","banana"};
        int key=12;
        String key1="apple";
        linearsearch(numbers, key, fruits, key1);

    }
}

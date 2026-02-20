public class Bubblesort {
    public static void Bubble(int array[]){
        int n=array.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<(n-i)-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    
                }

            }
        }
        
    }
    public static void main(String[] args) {
        int array[]={5,4,3,2,1};
        Bubble(array);
        System.out.println("THE SORTED ARRAY IS :");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
        
    }
}

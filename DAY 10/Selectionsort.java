public class Selectionsort {
    
    public static void selectionsort(int array[]){
        int n=array.length;
        for(int i=0;i<n;i++){
            int minpos=i;
            for(int j=i+1;j<n;j++){
                if(array[minpos]>array[j]){
                    minpos=j;
                }
            }
            //SWAP

            int temp=array[minpos];
            array[minpos]=array[i];
            array[i]=temp;

        }
    }
    public static void main(String[] args) {
        int array[]={5,4,1,2,3};
        selectionsort(array);
        System.out.println("THE SORTED ARRAY IS:");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
    }
}

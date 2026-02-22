public class Binarysearch {
    public static int binarySearch(int n,int numbers[],int key){
        int start=0;
        int end=(numbers.length)-1;
        int mid;
        while(start<=end){
            mid=(start+end)/2;

            //comparisons
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){//RIGHT
                start=mid+1;
            }
            else{//LEFT
                end=mid-1;

            }
            
        }
        return -1;

    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14};
        int key=10;

        int result=binarySearch(key, numbers, key);
        System.out.println("THE ELEMENT IS AT INDEX..."+result);
    }
}

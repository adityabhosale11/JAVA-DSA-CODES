public class Trappingwater {
    public static int trappedwater(int height[]){
        int n=height.length;
         //CALCULATING LEFTMAX...

         int LeftMax[]=new int[n];
         LeftMax[0]=height[0];
         for(int i=1;i<n;i++){
            LeftMax[i]=Math.max(height[i],LeftMax[i-1]);
         }

         //CALCULATING RIGHTMAX...

         int RightMax[]=new int [n];
         RightMax[n-1]=height[n-1];
         for(int i=n-2;i>=0;i--){
            RightMax[i]=Math.max(height[i], RightMax[i+1]);
         }

         int Trappedwater=0;

         for(int i=0;i<n;i++){

            //WATERLEVEL=MIN(LEFTMAX BOUND,RIGHTMAX BOUND)
            int Waterlevel=Math.min(LeftMax[i], RightMax[i]);

            //TRAPPEDWATER=WATERLEVEL-HEIGHT[I]
            Trappedwater+=Waterlevel-height[i];
            }

        return Trappedwater;



    }
    
    
    public static void main(String[] args) {
            int height[]={4,2,0,6,3,2,5};

        System.out.println(trappedwater(height));
    }
}

public class Spiralmatrix {
    public static void printspiral(int matrix[][]){
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;

        while(startrow<=endrow && startcol<=endcol){
            //TOP
            for(int j=0;j<=endcol;j++){
                System.out.println(matrix[startrow][j]+" ");
            }

            //RIGHT
            for(int i=0;i<=endrow;i++){
                System.out.println(matrix[i][endcol]+" ");
            }

            //BOTTOM
            for(int j=endcol-1;j>=startcol;j--){
                System.out.println(matrix[endrow][j]+" ");
            }

            //LEFT
            for(int i=endrow-1;i>=startrow+1;i++){
                System.out.println(matrix[i][startcol]+" ");
            }

            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }

        System.out.println();

    }
    public static void main(String[] args) {
        int marix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printspiral(marix);
    }
}

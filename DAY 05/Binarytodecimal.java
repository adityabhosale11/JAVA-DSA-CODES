public class Binarytodecimal {
    public static void bintodec(int binarynum){
        int orgnum=binarynum;
        int power=0;
        int dec=0;
        while(binarynum>0){
            int lastdigit=binarynum%10;
            dec=dec+(lastdigit*(int)Math.pow(2, power));

            power++;
            binarynum=binarynum/10;
        }
        System.out.println("THE DECIMAL OF "+orgnum+" IS ="+dec);
    }
    public static void main(String[] args) {
        bintodec(10011);
    }
}

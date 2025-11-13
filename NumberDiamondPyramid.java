public class NumberDiamondPyramid {
    public static void main(String[] args) {
        int count=3;
        int n=4;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(count);
            }
            count++;
            System.out.println();
        }
         for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print(count);
            }
            count--;
            System.out.println();
        }
    }
}

public class rightAngleNumberInvertedPyramid {
    public static void main(String[] args) {
        int n=4;
        int count=11;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                count--;
                System.out.print(count);
            }
            System.out.println();
        }
    }
}

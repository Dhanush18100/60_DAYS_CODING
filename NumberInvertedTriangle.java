public class NumberInvertedTriangle {
    public static void main(String[] args) {
        int count=6;
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(count);
            }
            count--;
            System.out.println();
        }

    }
}

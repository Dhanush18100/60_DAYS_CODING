public class TrianglePattern {
    public static void main(String[] args) {
        int n=4;
        int count=3;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(count);
            }
            count++;
            System.out.println();
        }
    }
}

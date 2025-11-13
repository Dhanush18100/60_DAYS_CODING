public class hallowPyramind {
    public static void main(String[] args) {
        int n=4;
        int k=0;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            while(k!=(2*i-1)){
                if(k==0 || k==2*i-2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                k++;

            }
            k=0;
            System.out.println();
        }
        for(int i=0;i<2*n-1;i++){
            System.out.print("*"); 
        }
    }
}

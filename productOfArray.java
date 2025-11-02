import java.util.Arrays;

public class productOfArray {
    public static void main(String[] args) {
         int[] arr = {10, 3, 5, 6, 2};
         int res[]=productArray(arr);
         System.out.println(Arrays.toString(res));
    }
    // public static int[] productArray(int arr[]){
    //     int res[]=new int[arr.length];
    //     Arrays.fill(res, 1);
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=0;j<arr.length;j++){
    //             if(i!=j){
    //                 res[i]*=arr[j];
    //             }
    //         }
    //     }
    //     return res;
    // }
    public static int[] productArray(int arr[]){
        int result[]=new int[arr.length];
        result[0]=1;
        for(int i=1;i<arr.length;i++){
            result[i]=result[i-1]*arr[i-1];
        }
        int right=1;
        for(int i=arr.length-1;i>=0;i--){
            result[i]*=right;
            right*=arr[i];
        }
        return result;
    }
}

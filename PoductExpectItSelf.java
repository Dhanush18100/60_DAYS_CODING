import java.util.Arrays;

public class PoductExpectItSelf {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] result = productExpectItself(arr);
        System.out.println(Arrays.toString(result));

    }
    public static int[] productExpectItself(int arr[]){
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

public class maximumSubArray {
    public static void main(String[] args) {
         int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubarraySum(arr));
    }
    // public static int maxSubarraySum(int[] arr){
    //     int res=arr[0];
    //     for(int i=0;i<arr.length;i++){
    //         int currentSum=0;
    //         for(int j=i;j<arr.length;j++){
    //             currentSum+=arr[j];
    //             res=Math.max(res,currentSum);
    //         }
    //     }
    //     return res;
    //}

    // using Kadanes Algorithm
     public static int maxSubarraySum(int[] arr){
        int res=arr[0];
        int maxEnding=arr[0];
        for(int i=1;i<arr.length;i++){
            maxEnding=Math.max(maxEnding+arr[i],arr[i]);
            res=Math.max(maxEnding,res);
        }
        return res;

     }
}

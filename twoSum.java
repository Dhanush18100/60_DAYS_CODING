import java.util.*;

public class twoSum {
    public static void main(String[] args) {
        int[] arr = { 0, -1, 2, -3, 1 };
        int target = -2;
        System.out.println(Arrays.toString(TwoSum(arr, target)));
    }

    // Brute force

    // public static boolean TwoSum(int[] arr,int target){
    // for(int i=0;i<arr.length;i++){
    // for(int j=i+1;j<arr.length;j++){
    // if(arr[i]+arr[j]==target){
    // return true;
    // }
    // }
    // }
    // return false;
    // }

    // Two Pointer

    // public static boolean TwoSum(int[] arr,int target){
    // Arrays.sort(arr);
    // int left=0,right=arr.length-1;
    // while(left<=right){
    // int sum=arr[left]+arr[right];

    // if(sum==target){
    // return true;
    // }
    // if(sum<target){
    // left++;
    // }else{
    // right--;
    // }
    // }
    // return false;
    // }

    public static int[] TwoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(arr[i], i);
        }
        return new int[] { -1, -1 };
    }
}

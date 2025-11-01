public class subArray {
    public static void main(String[] args) {
        int arr[] = {1, 4, 20, 3, 10, 5};
        int sum = 33;
        findSubarray(arr, sum);
    }
    public static void findSubarray(int arr[],int sum){
        int start=0,currentSum=0;
        for(int end=0;end<arr.length;end++){
            currentSum+=arr[end];
        
        while(currentSum>sum&&start<end){
            currentSum-=arr[start];
            start++;
        }
        if(currentSum==sum){
            System.out.println("Subarray found from index " + start + " to " + end);
            return;
        }
    }
    System.out.println("No subarray with given sum found");
    }
}

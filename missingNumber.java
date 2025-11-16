public class missingNumber {
    public static void main(String[] args) {
        int arr[]={3,0,1};
        int totalSum=0;
        int actualSum=0;
        // int missingNumber=-1;
        for(int i=0;i<arr.length;i++){
            totalSum+=i;
            actualSum+=arr[i];
        }
        totalSum+=arr.length;
        System.out.println("Missing Number: "+(totalSum-actualSum));
    }
}

public class binarySearch {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;
        int index = binary(arr, key);

        if (index == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + index);
    }
    public static int binary(int []arr,int key){
        int left=0,right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
}

import java.util.Arrays;

public class secondLargestElementArray {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 5, 50, 50 };
        Arrays.sort(arr);
        int largest=arr[arr.length-1];
        int secondLargest=-1;
        for(int i=2;i>=0;i--){
            if(arr[i]!=largest){
                secondLargest=arr[i];
                break;
            }
        }
         if (secondLargest == -1) {
            System.out.println("All elements are equal, no second largest element.");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }
    }
}

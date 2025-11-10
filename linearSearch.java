public class linearSearch {
    public static void main(String[] args) {
         int arr[] = {5, 8, 1, 3, 9};
        int key = 3;
        int result = search(arr, key);
        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + result);
    }
    public static int search(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}

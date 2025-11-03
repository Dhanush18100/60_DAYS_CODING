public class minimumElement {
    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 2, 3, 4};
        System.out.println(findMin(arr));
    }
    public static int findMin(int []arr){
        int res=arr[0];
        for(int i=0;i<arr.length;i++){
            res=Math.min(arr[i],res);
        }
        return res;
    }
}

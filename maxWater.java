public class maxWater {
    public static void main(String[] args) {
        int arr[]={2, 1, 8, 6, 4, 6, 5, 5};
    }
    public static int maximunWater(int arr[]){
        int res=arr[0];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int amount=Math.min(arr[i], arr[j])*(j-i);
                 res=Math.max(res,amount);
            }
        }
        return res;
    }
}

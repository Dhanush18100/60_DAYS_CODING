import java.util.ArrayList;
import java.util.Arrays;

public class Threesum {
    public static void main(String[] args) {
          int[] arr = {0, -1, 2, -3, 1};
          System.out.println(findTripplets(arr));
    }
    public static ArrayList<ArrayList<Integer>> findTripplets(int arr[]){
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        ArrayList<Integer> triplet = new ArrayList<>();
                        triplet.add(i);
                        triplet.add(j);
                        triplet.add(k);
                        ans.add(triplet);
                    }
                }
            }
        }
        return ans;
    }
}

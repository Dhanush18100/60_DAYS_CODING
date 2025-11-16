import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSome {
    public static void main(String[] args) {
         threeSome obj = new threeSome();
        int[] nums = {-1,0,1,2,-1,-4};

        List<List<Integer>> result = obj.threeSum(nums);

        System.out.println(result);
    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        Arrays.sort(nums);
        int i,j,k;
        for(i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            j=i+1;
            k=nums.length-1;
            while (j<k) {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }else if(sum>0){
                    k--;
                }else{
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while(j<k &&nums[j]==nums[j+1]){
                        j++;
                    }
                    while(j<k && nums[k]==nums[k-1]){
                        k--;
                    }
                    j++;
                    k--;
                }
            }
        }
        return res;
    }
}

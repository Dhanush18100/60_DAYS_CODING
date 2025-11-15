import java.util.HashMap;

public class twoSumm {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        if (result.length == 0) {
            System.out.println("No pair found!");
        } else {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        }
    }
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer>getPair=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(getPair.containsKey(target-num)){
                return new int[]{i,getPair.get(target-num)};
            }
            getPair.put(num,i);
        }
        return new int[]{};
    }
}

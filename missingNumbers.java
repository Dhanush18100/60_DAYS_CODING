import java.util.HashSet;

public class missingNumbers {
    public static void main(String[] args) {
         int[] arr = {3, 4, -1, 1};
        System.out.println("Smallest missing positive number: " + findMissing(arr));
    }
    public static int findMissing(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        for(int num:arr){
            if(num>0){
                set.add(num);
            }
        }
        int i=1;
        while(true){
            if(!set.contains(i)){
                return i;
            }
            i++;
        }

    }
}

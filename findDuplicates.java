import java.util.*;

public class findDuplicates {
    public static void main(String[] args) {
         int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDuplicate(arr));
        
    }
    public static List<Integer> findDuplicate(int[] arr){
        HashSet<Integer>set=new HashSet<>();
        HashSet<Integer>duplicate=new HashSet<>();
        for(int num:arr){
            if(!set.add(num)){
                duplicate.add(num);
            }
        }
        return new ArrayList<>(duplicate);
    }
}

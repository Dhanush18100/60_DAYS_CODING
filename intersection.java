import java.util.HashSet;

public class intersection {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {3, 4, 5, 6, 7};
        //On*n Time complexity

        // System.out.print("Intersection: ");
        // for(int i=0;i<arr1.length;i++){
        //     for(int j=0;j<arr2.length;j++){
        //         if(arr1[i]==arr2[j]){
        //             System.out.print(arr1[i]+" ");
        //              break;
        //         }
        //     }
        // }

        HashSet<Integer>set=new HashSet<>();
        HashSet<Integer>inser=new HashSet<>();

        for(int num:arr1){
            set.add(num);
        }
        for(int num:arr2){
            if(set.contains(num)){
                inser.add(num);
            }
        }
        System.out.println(inser);
    }
}

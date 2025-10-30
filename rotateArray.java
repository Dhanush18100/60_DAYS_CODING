import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int k=2;
        int temp[]=new int[arr.length];
        int m=0;
        for(int i=k;i<arr.length;i++ ){
            temp[m++]=arr[i];
        }
          for (int i = 0; i < k; i++) {
            temp[m++] = arr[i];
        }
        System.out.println(Arrays.toString(temp));

        
    }
}

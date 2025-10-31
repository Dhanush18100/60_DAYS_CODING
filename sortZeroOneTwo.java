import java.util.Arrays;

public class sortZeroOneTwo {
    public static void main(String[] args) {
        int arr[]={1,1,0,2,1,2,1,0};
        int zero=0,one=0,two=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }else if(arr[i]==1){
                one++;
            }
            else{
                two++;
            }
        }
        for(int i=0;i<zero;i++){
            arr[i]=0;
        }
        for(int i=zero;i<zero+one;i++){
            arr[i]=1;
        }
        for(int i=zero+one;i<zero+one+two;i++){
            arr[i]=2;
        }
        System.out.println(Arrays.toString(arr));

    }
}

public class possitiveNegative {
    public static void main(String[] args) {
        int arr[]={1, -2, 3, -4, -1, 4};
        int n=arr.length;
        int poss[]=new int[n];
        int neg[]=new int[n];
        int p=0,q=0;
        for(int num:arr){
            if(num>0){
                poss[p++]=num;
            }else{
                neg[q++]=num;
            }
        }
        int i=0,j=0,k=0;
        while(i<p&&j<q){
            arr[k++]=poss[i++];
            arr[k++]=neg[j++];
        }
        while(i<p){
            arr[k++]=poss[i++];
        }
        while(j<q){
            arr[k++]=neg[j++];
        }
        System.out.print("Rearranged array: "); for (int num : arr) System.out.print(num + " ");

    }
}

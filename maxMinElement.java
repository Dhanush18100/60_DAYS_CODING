public class maxMinElement{
    public static void main(String[]args){
        int arr[]={10,20,1,2,3};
        int min=arr[0],max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }else if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Min:"+min);
        System.out.println(("Max:"+max));
    }
}
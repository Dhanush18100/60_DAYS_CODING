public class majorityElement {
    public static void main(String[] args) {
        int arr[]={3,2,4,3,3,3,7};
        int majorityCount=arr.length/2;
        int majprityE=-1;
        for(int i=0;i<arr.length-1;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }   
            if(count>majorityCount){
                majprityE=arr[i];
                break;
            }
        }
        if(majprityE==-1){
            System.out.println("No majority element");
        }else{
            System.out.println("Majprity element is "+majprityE);
        }
    }
}

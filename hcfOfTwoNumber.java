public class hcfOfTwoNumber{
    public static void main(String[] args) {
        System.out.println(findHcf(70, 15));
    }
    public static int findHcf(int num1,int num2){
        int smalest=(num1<num2)?num1:num2;
        int hcf=1;
        for(int i=1;i<=smalest;i++){
            if(num1%i==0 && num2%i==0){
                hcf=i;
            }
        }
        return hcf;
    }
}
public class gcdOfTwoNumber {
    public static void main(String[] args) {
        int a=48,b=18;
       // int gcd=0;
        // for(int i=1;i<=a&&i<=b;i++){
        //     if(a%i==0 && b%i==0){
        //         gcd=i;
        //     }
        // }
        // System.out.println(gcd);
       
        System.out.println(findGCD(a, b));
    }
    public static int findGCD(int a, int b){
        //  while(b!=0){
        //     int temp=b;
        //     b=a%b;
        //     a=temp;
        // }
        // return a;
        if(b==0){
            return a;
        }
        return findGCD(b, a%b);
    }
}

public class reverse {
    public static void main(String[]args){
        int a=123;
        int rev=0;
        while(a!=0){
            int temp=a%10;
            rev=rev*10+temp;
            a/=10;
        }
        System.out.println(rev);
    }
}

public class NumberPalindrome {
    public static void main(String[] args) {
        int n=121;
        int originalNumber=n;
        int rev=0;
        while(n!=0){
            int temp=n%10;
            rev=rev*10+temp;
            n/=10;
        }
        if(rev==originalNumber){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}

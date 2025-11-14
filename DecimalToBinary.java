public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println(findBinary(10));
    }
    public static String findBinary(int n){
        String binary="";
        int temp=n;
        while(temp>0){
           int rem=temp%2;
           binary=rem+binary;
           temp=temp/2;
        }
        return binary;
    }
}

public class palindrome {
    public static void main(String[] args) {
        String s="mad";
        // String rev=new StringBuilder(s).reverse().toString();
        // if(s.equals(rev)){
        //     System.out.println("Yes");
        // }else{
        //     System.out.println("No");
        // }
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
           rev+=s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

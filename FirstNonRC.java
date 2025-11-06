public class FirstNonRC {
    public static void main(String[] args) {
         String str = "success";
        System.out.println("First non-repeating character: " + firstNonRepeatingChar(str));
    }
    public static char firstNonRepeatingChar(String str){
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                return ch;
            }
        }
        return 0;
    }
}

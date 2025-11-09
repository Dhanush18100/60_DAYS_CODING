public class palindromSentence {
    public static void main(String[] args) {
          String s = "Too hot to hoot.";
        System.out.println(isPalindrom(s)
                           			? "true" : "false");
    }
    public static boolean isPalindrom(String s){
        StringBuilder s1=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                s1.append(Character.toLowerCase(ch));
            }
        }
        StringBuilder rev=new StringBuilder(s1.toString());
        rev.reverse();
        return s1.toString().equals(rev.toString());
    }
}

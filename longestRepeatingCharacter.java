public class longestRepeatingCharacter {
    public static void main(String[] args) {
      String s = "aaaabbaaccde";
      System.out.println(maxRepeatingChar(s));   
    }
    public static char maxRepeatingChar(String s){
        int maxCount=0;
        char result=s.charAt(0);
        for(int i=0;i<s.length();i++){
            int count=0;
            for(int j=i;j<s.length();j++){
                if(s.charAt(i)!=s.charAt(j)){
                    break;
                }
                count++;
            }
            if(count>maxCount){
                maxCount=count;
                result=s.charAt(i);
            }
        }
        return result;
    }
}

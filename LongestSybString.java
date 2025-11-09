import java.util.HashSet;

public class LongestSybString {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(longestSubString(s));
    }
    public static int longestSubString(String s){
        HashSet<Character>set = new HashSet<>();
        int right=0,left=0,maxLength=0;
        while(right<s.length()){
            char ch=s.charAt(right);
            while(set.contains(ch)){
                set.remove(ch);
                left++;
            }
            set.add(ch);
            maxLength=Math.max(maxLength, right-left+1);
            right++;
        }
        return maxLength;

    }
}
